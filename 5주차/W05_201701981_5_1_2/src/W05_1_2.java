import java.util.Scanner;

public class W05_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int	numberOfstudents = 0;
		int score ;
		int sumOfscore = 0;
		double average;
		System.out.println("������ �Է��Ͻÿ�");
		score = scanner.nextInt();
		while (score >= 0) {
			
			if (score > 100) {
				System.out.println("[����!]");
			} else {
				sumOfscore = sumOfscore + score;
				numberOfstudents = numberOfstudents + 1;
			}
			System.out.println("������ �Է��Ͻÿ�");
			score = scanner.nextInt();
		}
		System.out.println("�л����� " + numberOfstudents+"���Դϴ�.");
		average = (double) sumOfscore / (double) numberOfstudents;
		System.out.println("����� " + average  +" �Դϴ�.");
		System.out.println();
		System.out.println("<< ���� ó�� ���α׷��� �����մϴ�. >>");
		scanner.close();
	}

}
