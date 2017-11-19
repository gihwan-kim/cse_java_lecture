import java.util.Scanner;

public class W04_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = 1;
		int givenN;
		Scanner as = new Scanner(System.in);
		System.out.println("Factorial 값을 계산 하시겠습니까?");
		System.out.print(" 계산하려면 Y를 입력하세요. : ");
		char userAnswer = as.next().charAt(0);
		while (userAnswer == 'Y') {

			System.out.println("<< Factorial에서 N의 값을 입력하세요 >>");
			givenN = as.nextInt();
			int k = 1;
			if (givenN < 0) {
				System.out.println("오류 : " + givenN + " 이(가) 음수이기 때문에 계산이 불가능합니다.");
			} else {
				if (givenN == 0) {
					factorial = 1;
					System.out.println(givenN + "factorial의 값은" + factorial + " 입니다.");

				} else {
					while (k <= givenN) {

						factorial = factorial * k;
						k = k + 1;
					}

					System.out.println(givenN + "! 은 " + factorial + " 입니다.");
					System.out.println();

				}

			}
			System.out.println("Factroial 계산을 더 하시겠습니까?");
			System.out.print(" 계산을 그만하려면 N을 입력하세요.");
			userAnswer = as.next().charAt(0);

		}
		as.close();
		System.out.println("<< Factorial 계산을 종료합니다. >>");
	}
}
