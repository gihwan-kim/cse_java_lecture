import java.util.Scanner;

public class W04_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = 1;
		int givenN;
		Scanner as = new Scanner(System.in);
		System.out.println("Factorial ���� ��� �Ͻðڽ��ϱ�?");
		System.out.print(" ����Ϸ��� Y�� �Է��ϼ���. : ");
		char userAnswer = as.next().charAt(0);
		while (userAnswer == 'Y') {

			System.out.println("<< Factorial���� N�� ���� �Է��ϼ��� >>");
			givenN = as.nextInt();
			int k = 1;
			if (givenN < 0) {
				System.out.println("���� : " + givenN + " ��(��) �����̱� ������ ����� �Ұ����մϴ�.");
			} else {
				if (givenN == 0) {
					factorial = 1;
					System.out.println(givenN + "factorial�� ����" + factorial + " �Դϴ�.");

				} else {
					while (k <= givenN) {

						factorial = factorial * k;
						k = k + 1;
					}

					System.out.println(givenN + "! �� " + factorial + " �Դϴ�.");
					System.out.println();

				}

			}
			System.out.println("Factroial ����� �� �Ͻðڽ��ϱ�?");
			System.out.print(" ����� �׸��Ϸ��� N�� �Է��ϼ���.");
			userAnswer = as.next().charAt(0);

		}
		as.close();
		System.out.println("<< Factorial ����� �����մϴ�. >>");
	}
}
