import java.util.Scanner ;

public class W08_8_2 {
	
	private static Scanner scanner = new Scanner(System.in) ;
	
	private static final int MAX_SIZE = 100 ;

	private static int inputScore() {
		
		int score = scanner.nextInt() ;
		
		return score ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score ;
		int sumOfStudents = 0 ;
		int sumOfScore = 0 ;
		int count =0;
		double average ;
		int i=0 ;
		
		int[] ascore = new int[MAX_SIZE] ;
		
		System.out.print(">점수를 입력하시오:") ;
		score = inputScore() ;
		
		while(score>=0){
			
			if ( score >100){
				
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.") ;
			}
			
			else{
				
				ascore[i] = score ;
				sumOfScore = sumOfScore + score ;
				
				i++ ;
				sumOfStudents++ ; 
			}
			System.out.print(">점수를 입력하시오:") ;
			score = inputScore() ;
		}
		average = (double)sumOfScore/(double)sumOfStudents;
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		
		System.out.println();
		System.out.println("모두 "+sumOfStudents+" 명의 성적이 입력되었습니다.");
		System.out.println("평균은 "+ average+" 입니다.");
		System.out.println();

		System.out.println("입력된 성적은 다음과 같습니다.");
		i=0;
		while(i < sumOfStudents){
			
			if(average <= ascore[i]){
				System.out.println("["+i+"] "+ascore[i]+" (평균 이상입니다.)");
				count ++;
			}
			else{
				System.out.println("["+i+"] "+ascore[i]+" (평균 미만입니다.)");
			}
			i++;
		}
		
		System.out.println("평균 이상의 학생의 수는"+count+" 명 입니다.");
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}

}
