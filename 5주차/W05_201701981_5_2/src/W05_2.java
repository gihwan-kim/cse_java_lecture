
public class W05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y;
		int n =1;
		System.out.println("<< Sine 값 출력 프로그램을 시작합니다. >>");
		
		while(n<=180){
		x = n*(3.141592/180.0);
		y = Math.sin(x);
		System.out.println("Sine("+ n +"도) 는 "+ y +"입니다.");
		n++;
		}
	}

}
