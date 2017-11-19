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
		
		System.out.println("계수 a의 값");
			a = A.nextDouble();
		System.out.println("계수 b의 값");
			b = B.nextDouble();
		System.out.println("계수 c의 값");
			c = C.nextDouble();

		A.close();
		B.close();
		C.close();
		
		if((-0.0000001<a) && (a<0.0000001)){
			System.out.println("오류 : 이차항의 계수가 0 이므로, 이차방정식을 풀 수 없습니다.");
		}
		else{
			determinant = b*b-4*a*c;
		
			System.out.println("a = " + a + " b = "+ b +" c = " + c );
		
			if (determinant < 0){
				System.out.println("판별식의 값이 0보다 작아서 실근이 존재하지 않습니다.");
			}
			else {
				x1 = (-b + Math.sqrt(determinant))/(2.0*a);
				x2 = (-b - Math.sqrt(determinant))/(2.0*a);
				
				System.out.println("The solution is " + x1 + " or " + x2);

			}
	}
	}
}
