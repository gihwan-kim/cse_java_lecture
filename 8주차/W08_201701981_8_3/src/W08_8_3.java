import java.util.Scanner;
public class W08_8_3 {
private static Scanner scanner = new Scanner(System.in) ;
	
	private static final int MAX_SIZE = 50 ;

	private static int inputScore() {
		
		int score = scanner.nextInt() ;
		
		return score ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int koreanscore, computerscore ;
		int sumOfStudents = 0 ;
		double personalAverage, average ;
		int i=0 ;
		double sumOfpersonalAverage = 0.0 ;
		int morethanAverageStudents =0 ;
		
		int[] kscore = new int[MAX_SIZE] ;
		int[] cscore = new int[MAX_SIZE] ;
		double[] pAverage = new double[MAX_SIZE] ;
		
		System.out.print(">점수를 입력하시오:") ;
		koreanscore = inputScore() ;
		computerscore = inputScore() ;
		while(koreanscore>=0||computerscore >=0){
			
			if ( koreanscore >100||computerscore >100){
				
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.") ;
			}
			
			else{
				
				kscore[i] = koreanscore ;
				cscore[i] = computerscore ;
				personalAverage = (double)(koreanscore + computerscore )/ 2.0;
				pAverage[i] = personalAverage;
				i++ ;
				sumOfStudents++ ; 
			}
			System.out.print(">점수를 입력하시오:") ;
			koreanscore = inputScore() ;
			computerscore = inputScore() ;
		}
		
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		
		System.out.println();
		System.out.println("모두 "+sumOfStudents+" 명의 성적이 입력되었습니다.");
		System.out.println();

		System.out.println("입력된 성적과 개인 평균은 다음과 같습니다.");
		i=0;
		while(i<sumOfStudents){
			System.out.println("["+i+"] "+kscore[i]+" "+cscore[i]+"(평균 "+ pAverage[i]+")");
			sumOfpersonalAverage = sumOfpersonalAverage + pAverage[i] ;
			i++;
		}
		average = sumOfpersonalAverage / (double)sumOfStudents ;
		i=0;
		while(i<sumOfStudents){
			if(average<=pAverage[i])
				morethanAverageStudents ++;
		i++;
		}
		System.out.println();
		System.out.println("학급 평균은"+average+" 입니다.");
		System.out.println("평균 이상인 학생의 수는 "+ morethanAverageStudents+" 명입니다.");
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}

}
