import java.util.Scanner;

public class W04_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as;
		double a;
		double b;
		double c;
		double determinant;
		double x1, x2;
		char userAnswer;
		as = new Scanner(System.in);
		System.out.println("이차방정식을 계산하겠습니까?");
		System.out.println("풀기를 원한다면 Y를 입력하세요.");

		userAnswer = as.next().charAt(0);

		while (userAnswer == 'Y') {
			System.out.println("이차방정식을 계산합니다!");

			System.out.println("계수 a의 값");
			a = as.nextDouble();
			System.out.println("계수 b의 값");
			b = as.nextDouble();
			System.out.println("계수 c의 값");
			c = as.nextDouble();

			determinant = b * b - 4 * a * c;

			System.out.println("a = " + a + " b = " + b + " c = " + c);

			if (determinant < 0) {
				System.out.println("판별식의 값이 0보다 작아서 실근이 존재하지 않습니다.");
			} else {
				x1 = (-b + Math.sqrt(determinant)) / (2.0 * a);
				x2 = (-b - Math.sqrt(determinant)) / (2.0 * a);
				System.out.println("The solution is " + x1 + " or " + x2);
				
			}
			System.out.println("이차방정식을 계산하겠습니까?");
			System.out.println("풀기를 원한다면 Y를 입력하세요.");
			userAnswer = as.next().charAt(0);
		}
			System.out.println("이차방정식 계산을 종료합니다!");
			as.close();
		
	}

}
