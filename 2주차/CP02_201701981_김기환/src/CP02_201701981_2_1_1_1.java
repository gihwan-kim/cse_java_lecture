
public class CP02_201701981_2_1_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		double determinant;
		double x1;
		double x2;
		
		a = 1; 
		b = 6;
		c = 9;
		
		determinant = b*b-4*a*c;
		System.out.println("<두 개가 동일한 실근, 즉 중근이 존재하는 경우>");
		System.out.println("a = " + a + " b = "+ b +" c = " + c );
		x1 = (-b + Math.sqrt(determinant))/(2.0*a);
		x2 = (-b - Math.sqrt(determinant))/(2.0*a);
		System.out.println("The solution is " + x1 + " or " + x2);
		
	}

}
