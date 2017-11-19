
public class CP02_2_1_중근1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		double determinant;
		double x1;
		double x2;
		
		a = 1.0;
		b = 6.0;
		c = 9.0;
		
		determinant = b*b-4*a*c;
		System.out.println("<두 개가 동일한 실근, 즉 중근이 존재하는 경우>");
		System.out.println("a = " + a + " b = "+ b +" c = " + c );
		x1 = (-b + Math.sqrt(determinant))/(2.0*a);
		x2 = (-b - Math.sqrt(determinant))/(2.0*a);
		System.out.println("The solution is " + x1 + " or " + x2);
		
	}

}
