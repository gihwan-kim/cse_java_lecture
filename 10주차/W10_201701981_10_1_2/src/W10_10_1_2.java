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
			System.out.print(">������ �Է��Ͻÿ�:") ;
			currentScore = inputScore() ;
			while(currentScore >= 0){
				if (currentScore >100){
					System.out.println("����: 100�� �Ѿ, �������� ������ �ƴմϴ�.");
				}
				else{
					student.setScore(currentScore) ;
					System.out.println("����:"+ currentScore + ", ����: "+student.grade()+" ����: "+student.grade2point()) ;
				}
				
				System.out.print(">������ �Է��Ͻÿ�:") ;
				currentScore = inputScore() ;
			}
			System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
			System.out.println();
			System.out.println("���α׷��� �����մϴ�.");
	}

}
