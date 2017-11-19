import java.util.Scanner;
public class W06_6_1 {
	public static Scanner scanner = new Scanner(System.in);
	
	private static void printAsterisks (int number)
	{
	int k=1;
	while(k<=number){
		System.out.print("*");		
		k++;
	}
	return;
		}
	private static int inputNumber()
	{
		int number;
		System.out.println();
		System.out.print("양의 정수(종료하려면 음수)를 입력하시오:");
		number = scanner.nextInt();
		return number;
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub

	System.out.println("<<양의 정수 값을 별의 개수로 출력하는 프로그램을 시작합니다>>");
	int j = inputNumber();
	while(j>=0){
	printAsterisks(j);
	j= inputNumber();
	
	}
	System.out.println("<< 양의 정수 값을 별의 개수로 출력하는 프로그램을 종료합니다.");
	}
}
