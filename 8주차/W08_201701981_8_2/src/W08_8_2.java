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
		
		System.out.print(">������ �Է��Ͻÿ�:") ;
		score = inputScore() ;
		
		while(score>=0){
			
			if ( score >100){
				
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.") ;
			}
			
			else{
				
				ascore[i] = score ;
				sumOfScore = sumOfScore + score ;
				
				i++ ;
				sumOfStudents++ ; 
			}
			System.out.print(">������ �Է��Ͻÿ�:") ;
			score = inputScore() ;
		}
		average = (double)sumOfScore/(double)sumOfStudents;
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		
		System.out.println();
		System.out.println("��� "+sumOfStudents+" ���� ������ �ԷµǾ����ϴ�.");
		System.out.println("����� "+ average+" �Դϴ�.");
		System.out.println();

		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		i=0;
		while(i < sumOfStudents){
			
			if(average <= ascore[i]){
				System.out.println("["+i+"] "+ascore[i]+" (��� �̻��Դϴ�.)");
				count ++;
			}
			else{
				System.out.println("["+i+"] "+ascore[i]+" (��� �̸��Դϴ�.)");
			}
			i++;
		}
		
		System.out.println("��� �̻��� �л��� ����"+count+" �� �Դϴ�.");
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");
	}

}
