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
		System.out.print("���� ����(�����Ϸ��� ����)�� �Է��Ͻÿ�:");
		number = scanner.nextInt();
		return number;
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub

	System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�>>");
	int j = inputNumber();
	while(j>=0){
	printAsterisks(j);
	j= inputNumber();
	
	}
	System.out.println("<< ���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�.");
	}
}
