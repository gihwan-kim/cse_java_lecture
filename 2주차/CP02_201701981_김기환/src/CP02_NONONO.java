
public class CP02_NONONO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		double determinant;
		double x1;
		double x2;
		
		a = 3; 
		b = 3;
		c = 4;
		
		determinant = b*b-4*a*c;
		System.out.println("�Ǳ��� �������� �ʴ� ���");
		System.out.println("a = " + a + " b = "+ b +" c = " + c );
		x1 = (-b + Math.sqrt(determinant))/(4*a*c);
		x2 = (-b - Math.sqrt(determinant))/(4*a*c);
		System.out.println("The solution is " + x1 + " or " + x2);
		
	}

}
