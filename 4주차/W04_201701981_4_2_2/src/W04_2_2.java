import java.util.Scanner;

public class W04_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as=new Scanner(System.in);
		System.out.println("Factorial 값을 계산 하시겠습니까?");
		System.out.print(" 계산하려면 Y를 입력하세요. : ");
		char userAnswer  = as.next().charAt(0);
		while(userAnswer == 'Y'){
			
		System.out.println("<< Factorial에서 N의 값을 입력하세요 >>");
		int givenN = as.nextInt();
		if(givenN < 0){
			System.out.println("오류 : "+givenN+" 이(가) 음수이기 때문에 계산이 불가능합니다.");
		}
			else{
				System.out.println(givenN+"Factorial 값을 계산려고 합니다. ");
				
				
				}
		System.out.println("Factroial 계산을 더 하시겠습니까?");
		System.out.print(" 계산을 계속하려면 Y를 입력하세요.");
			userAnswer  = as.next().charAt(0);
		
		}
		as.close();
		System.out.println("<< Factorial 계산을 종료합니다. >>");
	}
}
