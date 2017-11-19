import java.util.Scanner;

public class W10_10_1_2 {	
		private static Scanner scanner = new Scanner(System.in);
		private static int inputScore(){
			int score ; 
			score = scanner.nextInt() ;
			return score ;
		}
		public static void main(String[] args) {
			int currentScore ;
			Student student = new Student() ;
			System.out.print(">점수를 입력하시오:") ;
			currentScore = inputScore() ;
			while(currentScore >= 0){
				if (currentScore >100){
					System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닙니다.");
				}
				else{
					student.setScore(currentScore) ;
					System.out.println("점수:"+ currentScore + ", 학점: "+student.grade()+" 평점: "+student.grade2point()) ;
				}
				
				System.out.print(">점수를 입력하시오:") ;
				currentScore = inputScore() ;
			}
			System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
			System.out.println();
			System.out.println("프로그램을 종료합니다.");
	}

}
