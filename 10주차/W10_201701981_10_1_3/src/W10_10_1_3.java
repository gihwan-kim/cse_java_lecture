import java.util.Scanner ;
public class W10_10_1_3 {
	private static Scanner scanner = new Scanner(System.in);
	private static int inputScore(){
		int score ;
		score = scanner.nextInt() ;
		return score ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int koreanScore ;
		int englishScore ;
		int computScore ;
		Student korean = new Student() ;
		Student english = new Student() ;
		Student comput = new Student() ;
		System.out.println("> 세 과목(국어,영어,컴퓨터) 의 점수를 차례로 입력합니다.");
		System.out.print("-점수를 입력하시오:");
		koreanScore = inputScore() ;
		System.out.print("-점수를 입력하시오:");
		englishScore = inputScore() ;
		System.out.print("-점수를 입력하시오:");
		computScore = inputScore() ;
		while(koreanScore > 0&&englishScore > 0 && computScore > 0){
			if(koreanScore > 100||englishScore > 100 || computScore > 100){
				System.out.println("오류 : 100이 넘어서 정상적인 점수가 아닌 것이 있습니다.");
			}
			else{
				korean.setScore(koreanScore);
				System.out.println("[국 어] 점수:" + koreanScore +", 학점: "+ korean.score2Grade()) ;
				english.setScore(englishScore);
				System.out.println("[영 어] 점수:" + englishScore +", 학점: "+ english.score2Grade()) ;
				comput.setScore(computScore);
				System.out.println("[컴퓨터] 점수:"+ computScore +", 학점: "+ comput.score2Grade()) ;
			} 
			System.out.println("> 세 과목(국어,영어,컴퓨터) 의 점수를 차례로 입력합니다.");
			System.out.print("-점수를 입력하시오:" );
			koreanScore = inputScore() ;
			System.out.print("-점수를 입력하시오:") ;
			englishScore = inputScore() ;
			System.out.print("-점수를 입력하시오:") ;
			computScore = inputScore() ;	
		}
		System.out.println("음수의 정수가 입력되어 입력을 종료합니다. ") ;
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}

}
