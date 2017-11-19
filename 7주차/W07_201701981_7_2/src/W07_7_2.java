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
			System.out.println("점수: " + score + ", 학점: " + agrade+"평점: "+ point );

		} else if (score >= 80) {
			agrade = 'B';
			double point =grade2Point(agrade);
			System.out.println("점수: " + score + ", 학점: " + agrade+"평점: "+ point);

		} else if (score >= 70) {
			agrade = 'C';
			double point =grade2Point(agrade);
			System.out.println("점수: " + score + ", 학점: " + agrade+"평점: "+ point);

		} else if (score >= 60) {
			agrade = 'D';
			double point =grade2Point(agrade);
			System.out.println("점수: " + score + ", 학점: " + agrade+"평점: "+ point);

		} else {
			agrade = 'F';
			double point =grade2Point(agrade);
			System.out.println("점수: " + score + ", 학점: " + agrade+"평점: "+ point);

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
				scoregrade = score2Grade(currentScore); //학점
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
