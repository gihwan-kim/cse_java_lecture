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
		
		System.out.print(">������ �Է��Ͻÿ�:") ;
		koreanscore = inputScore() ;
		computerscore = inputScore() ;
		while(koreanscore>=0||computerscore >=0){
			
			if ( koreanscore >100||computerscore >100){
				
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.") ;
			}
			
			else{
				
				kscore[i] = koreanscore ;
				cscore[i] = computerscore ;
				personalAverage = (double)(koreanscore + computerscore )/ 2.0;
				pAverage[i] = personalAverage;
				i++ ;
				sumOfStudents++ ; 
			}
			System.out.print(">������ �Է��Ͻÿ�:") ;
			koreanscore = inputScore() ;
			computerscore = inputScore() ;
		}
		
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		
		System.out.println();
		System.out.println("��� "+sumOfStudents+" ���� ������ �ԷµǾ����ϴ�.");
		System.out.println();

		System.out.println("�Էµ� ������ ���� ����� ������ �����ϴ�.");
		i=0;
		while(i<sumOfStudents){
			System.out.println("["+i+"] "+kscore[i]+" "+cscore[i]+"(��� "+ pAverage[i]+")");
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
		System.out.println("�б� �����"+average+" �Դϴ�.");
		System.out.println("��� �̻��� �л��� ���� "+ morethanAverageStudents+" ���Դϴ�.");
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");
	}

}
