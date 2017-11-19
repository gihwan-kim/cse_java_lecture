import java.util.Scanner;
public class W07_7_3 {
	public static Scanner scanner = new Scanner(System.in);
	public static int inputScore(){
		int score = scanner.nextInt();
		return score;
	}
	public static char score2Grade(int score){
		char grade;
		if(score>=90){
			grade = 'A';
		}
		else if(score>=80){
			grade = 'B';
		}
		else if(score>=70){
			grade = 'C';
		}
		else if(score>=60){
			grade = 'D';
		}
		else{
			grade = 'F';
		}
		return grade;
	}
	public static double grade2Point(char grade){
		double grade2Point;
		if(grade=='A'){
			grade2Point = 4.0;
		}
		else if(grade=='B'){
			grade2Point = 3.0;
		}
		else if(grade=='C'){
			grade2Point = 2.0;
		}
		else if(grade=='D'){
			grade2Point = 1.0;
		}
		else{
			grade2Point = 0.0;
		}
		return grade2Point;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char koreanGrade;
		char englishGrade;
		char computGrade;
		double koreanGradePoint, englishGradePoint, computGradePoint;
		System.out.println("> 세과목 (국어,영어,컴퓨터) 의 점수를 차례로 입력합니다.:");
		System.out.print("-점수를 입력하시오:");
		int koreanScore = inputScore();
		System.out.print("-점수를 입력하시오:");
		int englishScore = inputScore();
		System.out.print("-점수를 입력하시오:");
		int computScore = inputScore();
		
		while(computScore>=0||koreanScore>=0||englishScore>=0){
			
			if(computScore>100||koreanScore>100||englishScore>100){
				System.out.println("오류: 100 이 넘어서, 정상적인 점수가 아닌 것이 있습니다.");
			
			}
	
			else{
				koreanGrade = score2Grade(koreanScore);
				koreanGradePoint = grade2Point(koreanGrade);
				System.out.println("[국 어]점수 :"+koreanScore+", 학점:"+koreanGrade+", 평점:"+koreanGradePoint);

				englishGrade = score2Grade(englishScore);
				englishGradePoint = grade2Point(englishGrade);
				System.out.println("[영 어]점수 :"+englishScore+", 학점:"+englishGrade+", 평점:"+ englishGradePoint);

				computGrade = score2Grade(computScore);
				computGradePoint = grade2Point(computGrade);
				System.out.println("[컴퓨터]점수 :"+computScore+", 학점:"+computGrade+", 평점"+computGradePoint);
				
			}
			System.out.print("-점수를 입력하시오:");
			koreanScore = inputScore();
			System.out.print("-점수를 입력하시오:");
			englishScore = inputScore();
			System.out.print("-점수를 입력하시오:");
			computScore = inputScore();
		}
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}
}
