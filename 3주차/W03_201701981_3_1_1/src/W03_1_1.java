import java.util.Scanner;

public class W03_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner A;
		Scanner B;
		Scanner C;
		double a;
		double b;
		double c;
		double determinant;
		double x1, x2;
		
		
		A = new Scanner(System.in);
		B = new Scanner(System.in);
		C = new Scanner(System.in);
		System.out.println("계수 a의 값");
		 a = A.nextDouble();
		 System.out.println("계수 b의 값");
		 b = B.nextDouble();
		 System.out.println("계수 c의 값");
		c =C.nextDouble();
		A.close();
		B.close();
		C.close();
		determinant = b*b-4*a*c;
		System.out.println("a = " + a + " b = "+ b +" c = " + c );
		x1 = (-b + Math.sqrt(determinant))/(2.0*a);
		x2 = (-b - Math.sqrt(determinant))/(2.0*a);
		System.out.println("The solution is " + x1 + " or " + x2);
	}

}
