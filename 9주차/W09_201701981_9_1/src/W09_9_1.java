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
		
		System.out.print(">������ �Է��Ͻÿ�:") ;
		score = scanner.nextInt() ;

		while(score>0){
		
			if(score>=0){
			
				if(score>100){
					System.out.println("���� : 100�� �Ѿ �������� ������ �ƴմϴ�.") ;
				}
				else{
					ascore[i] = score ;
					i++ ;
					numberOfStudents++ ;
				}
			}
			System.out.print(">������ �Է��Ͻÿ�:") ;
			score = scanner.nextInt() ;
		
		}
		average = score2Average(ascore , numberOfStudents) ;
		System.out.println();
		System.out.println("��� "+numberOfStudents+" ���� ������ �ԷµǾ����ϴ�.") ;
		System.out.println("����� "+ average+" �Դϴ�.");
		System.out.println();
		i = 0 ;
		while(i<numberOfStudents){
			
			if(average <ascore[i]){
				System.out.println("["+i+"]"+" "+ascore[i]+" (����̻��Դϴ�.)") ;
				nOMTAS++ ;
			}
			else{
				System.out.println("["+ i+"]"+ " "+ ascore[i]+" (��� �̸��Դϴ�.)") ;
			}
			i++ ;
		}
		System.out.println("��� �̻��� �л��� ���� "+ nOMTAS+" �Դϴ�.") ;
		System.out.println();
		maxScore = maxScore(ascore ,numberOfStudents) ;
		System.out.println("�ְ����� "+ maxScore+"�Դϴ�.");
		lowScore = lowScore(ascore , numberOfStudents) ;
		System.out.println("�������� "+ lowScore+"�Դϴ� .");
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");
	}
}
