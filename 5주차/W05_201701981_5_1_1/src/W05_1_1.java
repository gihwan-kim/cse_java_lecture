import java.util.Scanner;

public class W05_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade;
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		grade = scanner.nextInt();
		while(grade>=0){
			if(grade>100){
				System.out.println("���� : �ִ����� 100�� �Ѿ����ϴ�.");
			}
			else{
				
			}
				System.out.print("������ �Է��ϼ��� : ");
				grade = scanner.nextInt();

		}
		System.out.println("���� �Է��� �����մϴ�.");
		scanner.close();
	}

}
