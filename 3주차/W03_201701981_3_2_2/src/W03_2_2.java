import java.util.Scanner;

public class W03_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		int givenN;
		int count=1;
		int sum = 0;
		System.out.println("1���� N������ �� ����ϱ�");
		System.out.println("givenN�� ����?");
		givenN = aScanner.nextInt();
		
		while(count<=givenN){
			sum=sum+count;
			System.out.println("1����"+ count+"������ ����"+ sum+"�Դϴ�.");
			count = count+1; 
	}
			aScanner.close();
	}

}
