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
		System.out.println("������������ ����ϰڽ��ϱ�?");
		System.out.println("Ǯ�⸦ ���Ѵٸ� Y�� �Է��ϼ���.");

		userAnswer = as.next().charAt(0);

		while (userAnswer == 'Y') {
			System.out.println("������������ ����մϴ�!");

			System.out.println("��� a�� ��");
			a = as.nextDouble();
			System.out.println("��� b�� ��");
			b = as.nextDouble();
			System.out.println("��� c�� ��");
			c = as.nextDouble();

			determinant = b * b - 4 * a * c;

			System.out.println("a = " + a + " b = " + b + " c = " + c);

			if (determinant < 0) {
				System.out.println("�Ǻ����� ���� 0���� �۾Ƽ� �Ǳ��� �������� �ʽ��ϴ�.");
			} else {
				x1 = (-b + Math.sqrt(determinant)) / (2.0 * a);
				x2 = (-b - Math.sqrt(determinant)) / (2.0 * a);
				System.out.println("The solution is " + x1 + " or " + x2);
				
			}
			System.out.println("������������ ����ϰڽ��ϱ�?");
			System.out.println("Ǯ�⸦ ���Ѵٸ� Y�� �Է��ϼ���.");
			userAnswer = as.next().charAt(0);
		}
			System.out.println("���������� ����� �����մϴ�!");
			as.close();
		
	}

}
