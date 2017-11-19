import java.util.Scanner;

public class W03_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		int givenN;
		int count=1;
		int sum = 0;
		System.out.println("1부터 N까지의 합 출력하기");
		System.out.println("givenN의 값은?");
		givenN = aScanner.nextInt();
		
		while(count<=givenN){
			sum=sum+count;
			System.out.println("1부터"+ count+"까지의 합은"+ sum+"입니다.");
			count = count+1; 
	}
			aScanner.close();
	}

}
