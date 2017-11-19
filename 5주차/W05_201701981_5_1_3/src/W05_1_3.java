import java.util.Scanner;

public class W05_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numberOfstudents = 0;
		int score;
		int sumOfscore = 0;
		double average;
		System.out.print("성적을 입력하시오 : ");
		score = scanner.nextInt();
		while (score >= 0) {
			if ((score >= 90 && score <= 100)) {
				System.out.println("  (성적 : " + score + ", 학점:A)");

			} else if ((score >= 80 && score <= 89)) {
				System.out.println("  (성적 : " + score + ", 학점:B)");
			} else if ((score >= 70 && score <= 79)) {
				System.out.println("  (성적 : " + score + ", 학점:C)");
			} else if ((score >= 60 && score <= 69)) {
				System.out.println("  (성적 : " + score + ", 학점:D)");
			} else if ((score >= 0 && score <= 59)) {
				System.out.println("  (성적 : " + score + ", 학점:F)");
			}
			if (score > 100) {
				System.out.println("오류: 최대점수 100 을 넘었습니다.");
				System.out.println();
			} else {
				sumOfscore = sumOfscore + score;
				numberOfstudents = numberOfstudents + 1;
			}
			System.out.print("성적을 입력하시오 : ");
			score = scanner.nextInt();
		}
		System.out.println();
		System.out.println("학생수는 " + numberOfstudents + "명입니다.");
		average = (double) sumOfscore / (double) numberOfstudents;
		System.out.println("평균은 " + average + " 입니다.");
		System.out.println();
		System.out.println("<< 성적 처리 프로그램을 종료합니다. >>");
		scanner.close();
	}

}
