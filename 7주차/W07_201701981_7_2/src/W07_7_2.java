import java.util.Scanner;

public class W07_7_2 {
	private static Scanner scanner = new Scanner(System.in);

	private static int inputScore() {
		int score = scanner.nextInt();
		return score;
	}

	private static char score2Grade(int score) {
		char agrade;
		if (score >= 90) {
			agrade = 'A';
			double point = grade2Point(agrade);
			System.out.println("����: " + score + ", ����: " + agrade+"����: "+ point );

		} else if (score >= 80) {
			agrade = 'B';
			double point =grade2Point(agrade);
			System.out.println("����: " + score + ", ����: " + agrade+"����: "+ point);

		} else if (score >= 70) {
			agrade = 'C';
			double point =grade2Point(agrade);
			System.out.println("����: " + score + ", ����: " + agrade+"����: "+ point);

		} else if (score >= 60) {
			agrade = 'D';
			double point =grade2Point(agrade);
			System.out.println("����: " + score + ", ����: " + agrade+"����: "+ point);

		} else {
			agrade = 'F';
			double point =grade2Point(agrade);
			System.out.println("����: " + score + ", ����: " + agrade+"����: "+ point);

		}
		return agrade;
	}
	private static double grade2Point(char agrade ){
		char currentgrade = agrade;
		double point;
		
		
		if(currentgrade == 'A'){
			point = 4.0;
		}
		else if(currentgrade == 'B'){
			point = 3.0;
		}
		else if(currentgrade == 'C'){
			point = 2.0;
		}
		else if(currentgrade == 'F'){
			point = 1.0;
		}
		else {
			point = 0.0;
		}
		return point;
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
				scoregrade = score2Grade(currentScore); //����
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
