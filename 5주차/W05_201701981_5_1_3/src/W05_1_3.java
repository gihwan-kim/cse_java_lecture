import java.util.Scanner;

public class W05_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numberOfstudents = 0;
		int score;
		int sumOfscore = 0;
		double average;
		System.out.print("������ �Է��Ͻÿ� : ");
		score = scanner.nextInt();
		while (score >= 0) {
			if ((score >= 90 && score <= 100)) {
				System.out.println("  (���� : " + score + ", ����:A)");

			} else if ((score >= 80 && score <= 89)) {
				System.out.println("  (���� : " + score + ", ����:B)");
			} else if ((score >= 70 && score <= 79)) {
				System.out.println("  (���� : " + score + ", ����:C)");
			} else if ((score >= 60 && score <= 69)) {
				System.out.println("  (���� : " + score + ", ����:D)");
			} else if ((score >= 0 && score <= 59)) {
				System.out.println("  (���� : " + score + ", ����:F)");
			}
			if (score > 100) {
				System.out.println("����: �ִ����� 100 �� �Ѿ����ϴ�.");
				System.out.println();
			} else {
				sumOfscore = sumOfscore + score;
				numberOfstudents = numberOfstudents + 1;
			}
			System.out.print("������ �Է��Ͻÿ� : ");
			score = scanner.nextInt();
		}
		System.out.println();
		System.out.println("�л����� " + numberOfstudents + "���Դϴ�.");
		average = (double) sumOfscore / (double) numberOfstudents;
		System.out.println("����� " + average + " �Դϴ�.");
		System.out.println();
		System.out.println("<< ���� ó�� ���α׷��� �����մϴ�. >>");
		scanner.close();
	}

}
