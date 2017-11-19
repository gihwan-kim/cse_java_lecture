import java.util.Scanner;

public class W05_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int	numberOfstudents = 0;
		int score ;
		int sumOfscore = 0;
		int numberOfA = 0;
		int numberOfB=0;
		int numberOfC=0;
		int numberOfD=0;
		int numberOfF=0;
		double average;
		System.out.println("<< 성적 처리 프로그램을 시작합니다. >>");
		System.out.println();
		System.out.print("성적을 입력하시오:");
		score = scanner.nextInt();
		while (score >= 0) {
			if((score>=90 && score<=100)){
				System.out.println("  (성적 : "+ score + ", 학점:A)");
				numberOfA = numberOfA + 1;
			}
			else if((score>=80&&score<=89)){
				System.out.println("  (성적 : "+score+", 학점:B)");
				numberOfB = numberOfB + 1;
			}
			else if((score>=70&&score<=79)){
				System.out.println("  (성적 : "+score+", 학점:C)");
				numberOfC = numberOfC + 1;
			}
			else if((score>=60&&score<=69)){
				System.out.println("  (성적 : "+score+", 학점:D)");
				numberOfD = numberOfD + 1;
			}
			else if((score>=0&&score<=59)){
				System.out.println("  (성적 : "+score+", 학점:F)");
				numberOfF = numberOfF + 1;
			}
			if (score > 100) {
				System.out.println("[오류!]");
			} else {
				sumOfscore = sumOfscore + score;
				numberOfstudents = numberOfstudents + 1;
			}
			System.out.print("성적을 입력하시오:");
			score = scanner.nextInt();
		}
		System.out.println("학생수는 " + numberOfstudents+"명입니다.");
		average = (double) sumOfscore / (double) numberOfstudents;
		System.out.println("A는 "+numberOfA+" 명 입니다.");
		System.out.println("B는 "+numberOfB+" 명 입니다.");
		System.out.println("C는 "+numberOfC+" 명 입니다.");
		System.out.println("D는 "+numberOfD+" 명 입니다.");
		System.out.println("F는 "+numberOfF+" 명 입니다.");
		System.out.println("평균은 " + average  +" 입니다.");
		System.out.println();
		System.out.println("<< 성적 처리 프로그램을 종료합니다. >>");
		scanner.close();
	}

}
