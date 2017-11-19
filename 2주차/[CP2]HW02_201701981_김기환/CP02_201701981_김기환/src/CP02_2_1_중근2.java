
public class CP02_2_1_중근2 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double determinant;
		double x1;
		double x2;
		
		a = 1.0 ;
		b = 2.0 ;
		c = 1.0 ;
		System.out.println("<두 개가 동일한 실근, 즉 중근이 존재하는 경우>");
		System.out.println("a=" + a + " b="+b +" c="+c);
		determinant = b*b - 4*a*c;
		x1 = ( -b + Math.sqrt(determinant))/(2.0*a);
		x2 = ( -b - Math.sqrt(determinant))/(2.0*a);
		System.out.println("The solution is  "+ "x1 = " +x1  + " and " + "x2 = "+ x2);
		
		
		
		
		
		
		
		

	}

}
