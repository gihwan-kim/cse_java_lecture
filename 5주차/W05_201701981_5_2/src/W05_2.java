
public class W05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y;
		int n =1;
		System.out.println("<< Sine �� ��� ���α׷��� �����մϴ�. >>");
		
		while(n<=180){
		x = n*(3.141592/180.0);
		y = Math.sin(x);
		System.out.println("Sine("+ n +"��) �� "+ y +"�Դϴ�.");
		n++;
		}
	}

}
