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
			System.out.println("점수: " + score + ", 학점: " + agrade);

		} else if (score >= 80) {
			agrade = 'B';
			System.out.println("점수: " + score + ", 학점: " + agrade);

		} else if (score >= 70) {
			agrade = 'C';
			System.out.println("점수: " + score + ", 학점: " + agrade);

		} else if (score >= 60) {
			agrade = 'D';
			System.out.println("점수: " + score + ", 학점: " + agrade);

		} else {
			agrade = 'F';
			System.out.println("점수: " + score + ", 학점: " + agrade);

		}
		return agrade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("- 점수를 입력하시오:");
		int currentScore = inputScore();
		int gradeAnumber = 0;
		int gradeBnumber = 0;
		int gradeCnumber = 0;
		int gradeDnumber = 0;
		int gradeFnumber = 0;
		while (currentScore >= 0) {
			if (currentScore > 100) {
				System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닙니다.");
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

			System.out.print("- 점수를 입력하시오:");
			currentScore = scanner.nextInt();
		}

		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("A는 "+gradeAnumber+" 명입니다.");
		System.out.println("B는 "+gradeBnumber+" 명입니다.");
		System.out.println("C는 "+gradeCnumber+" 명입니다.");
		System.out.println("D는 "+gradeDnumber+" 명입니다.");
		System.out.println("F는 "+gradeFnumber+" 명입니다.");
		System.out.println("프로그램을 종료합니다.");

	}

}
