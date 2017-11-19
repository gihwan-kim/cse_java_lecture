import java.util.Scanner;

public class W07_7_1 {
	private static Scanner scanner = new Scanner(System.in);

	private static int inputScore() {
		int score = scanner.nextInt();
		return score;
	}

	private static char score2Grade(int score) {
		char agrade;
		if (score >= 90) {
			agrade = 'A';
			System.out.println("����: " + score + ", ����: " + agrade);

		} else if (score >= 80) {
			agrade = 'B';
			System.out.println("����: " + score + ", ����: " + agrade);

		} else if (score >= 70) {
			agrade = 'C';
			System.out.println("����: " + score + ", ����: " + agrade);

		} else if (score >= 60) {
			agrade = 'D';
			System.out.println("����: " + score + ", ����: " + agrade);

		} else {
			agrade = 'F';
			System.out.println("����: " + score + ", ����: " + agrade);

		}
		return agrade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("- ������ �Է��Ͻÿ�:");
		int currentScore = inputScore();
		int gradeAnumber = 0;
		int gradeBnumber = 0;
		int gradeCnumber = 0;
		int gradeDnumber = 0;
		int gradeFnumber = 0;
		while (currentScore >= 0) {
			if (currentScore > 100) {
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			} else {
				char scoregrade;
				scoregrade = score2Grade(currentScore);
				if (scoregrade == 'A') {
					gradeAnumber++;
				} else if (scoregrade == 'B') {
					gradeBnumber++;
				} else if (scoregrade == 'C') {
					gradeCnumber++;
				} else if (scoregrade == 'B') {
					gradeDnumber++;
				} else {
					gradeFnumber++;
				}
			}

			System.out.print("- ������ �Է��Ͻÿ�:");
			currentScore = scanner.nextInt();
		}

		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("A�� "+gradeAnumber+" ���Դϴ�.");
		System.out.println("B�� "+gradeBnumber+" ���Դϴ�.");
		System.out.println("C�� "+gradeCnumber+" ���Դϴ�.");
		System.out.println("D�� "+gradeDnumber+" ���Դϴ�.");
		System.out.println("F�� "+gradeFnumber+" ���Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");

	}

}
