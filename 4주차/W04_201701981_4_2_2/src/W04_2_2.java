import java.util.Scanner;

public class W04_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as=new Scanner(System.in);
		System.out.println("Factorial ���� ��� �Ͻðڽ��ϱ�?");
		System.out.print(" ����Ϸ��� Y�� �Է��ϼ���. : ");
		char userAnswer  = as.next().charAt(0);
		while(userAnswer == 'Y'){
			
		System.out.println("<< Factorial���� N�� ���� �Է��ϼ��� >>");
		int givenN = as.nextInt();
		if(givenN < 0){
			System.out.println("���� : "+givenN+" ��(��) �����̱� ������ ����� �Ұ����մϴ�.");
		}
			else{
				System.out.println(givenN+"Factorial ���� ������ �մϴ�. ");
				
				
				}
		System.out.println("Factroial ����� �� �Ͻðڽ��ϱ�?");
		System.out.print(" ����� ����Ϸ��� Y�� �Է��ϼ���.");
			userAnswer  = as.next().charAt(0);
		
		}
		as.close();
		System.out.println("<< Factorial ����� �����մϴ�. >>");
	}
}
