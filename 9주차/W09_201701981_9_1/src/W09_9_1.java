import java.util.Scanner;
public class W09_9_1 {
	
	private static final int MAX_SIZE = 100 ;
	private static Scanner scanner = new Scanner(System.in);
	
	private static double score2Average (int[] ascore, int numberOfStudents ){
		int i = 0 ;
		int sum = 0 ;
		double average ;
		while(i <= numberOfStudents -1){
			sum = sum + ascore[i] ;
			i++ ;
		}
		average = (double)sum/(double)numberOfStudents ;
		return average ;

	}
	private static int maxScore ( int[] ascore , int numbeOfStudents){
		int size = numbeOfStudents - 1 ;
		int maxScore ;
		int i = 0 ;
		int j = 1 ;
		maxScore = ascore[i] ;
		
		while(j < size){
			if(maxScore <ascore[j]){
				maxScore = ascore[j] ;
			}
			else{
			}
			j++ ;
		}
		return maxScore ;
	}
	private static int lowScore (int[] ascore , int numberOfStudents){
		int lowScore ;
		int size = numberOfStudents-1 ;
		int i = 0 ;
		int j = 1 ;
		lowScore = ascore[i];
		
		while(j < size){
			if(lowScore < ascore[j]){
				
			}
			
			else{
				lowScore = ascore[j] ;
			}
		j++;
		}
		return lowScore ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double average ;
		int score ;
		int i = 0 ;
		int numberOfStudents = 0 ;
		int numberOfMoreThanAverageStudents = 0 ;
		int nOMTAS = numberOfMoreThanAverageStudents ;
		int maxScore ; 
		int lowScore ;
		int[] ascore = new int[MAX_SIZE] ;
		
		System.out.print(">점수를 입력하시오:") ;
		score = scanner.nextInt() ;

		while(score>0){
		
			if(score>=0){
			
				if(score>100){
					System.out.println("오류 : 100이 넘어서 정상적인 점수가 아닙니다.") ;
				}
				else{
					ascore[i] = score ;
					i++ ;
					numberOfStudents++ ;
				}
			}
			System.out.print(">점수를 입력하시오:") ;
			score = scanner.nextInt() ;
		
		}
		average = score2Average(ascore , numberOfStudents) ;
		System.out.println();
		System.out.println("모두 "+numberOfStudents+" 명의 성적이 입력되었습니다.") ;
		System.out.println("평균은 "+ average+" 입니다.");
		System.out.println();
		i = 0 ;
		while(i<numberOfStudents){
			
			if(average <ascore[i]){
				System.out.println("["+i+"]"+" "+ascore[i]+" (평균이상입니다.)") ;
				nOMTAS++ ;
			}
			else{
				System.out.println("["+ i+"]"+ " "+ ascore[i]+" (평균 미만입니다.)") ;
			}
			i++ ;
		}
		System.out.println("평균 이상인 학생의 수는 "+ nOMTAS+" 입니다.") ;
		System.out.println();
		maxScore = maxScore(ascore ,numberOfStudents) ;
		System.out.println("최고점은 "+ maxScore+"입니다.");
		lowScore = lowScore(ascore , numberOfStudents) ;
		System.out.println("최저점은 "+ lowScore+"입니다 .");
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}
}
