import java.util.Scanner;

public class W03_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner A,B,C;
		double a,b,c;
		double determinant;
		double x1, x2;
		
		A = new Scanner(System.in);
		B = new Scanner(System.in);
		C = new Scanner(System.in);
		
		System.out.println("��� a�� ��");
			a = A.nextDouble();
		System.out.println("��� b�� ��");
			b = B.nextDouble();
		System.out.println("��� c�� ��");
			c = C.nextDouble();

		A.close();
		B.close();
		C.close();
		
		if((-0.0000001<a) && (a<0.0000001)){
			System.out.println("���� : �������� ����� 0 �̹Ƿ�, ������������ Ǯ �� �����ϴ�.");
		}
		else{
			determinant = b*b-4*a*c;
		
			System.out.println("a = " + a + " b = "+ b +" c = " + c );
		
			if (determinant < 0){
				System.out.println("�Ǻ����� ���� 0���� �۾Ƽ� �Ǳ��� �������� �ʽ��ϴ�.");
			}
			else {
				x1 = (-b + Math.sqrt(determinant))/(2.0*a);
				x2 = (-b - Math.sqrt(determinant))/(2.0*a);
				
				System.out.println("The solution is " + x1 + " or " + x2);

			}
	}
	}
}
