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
		System.out.println("> ������ (����,����,��ǻ��) �� ������ ���ʷ� �Է��մϴ�.:");
		System.out.print("-������ �Է��Ͻÿ�:");
		int koreanScore = inputScore();
		System.out.print("-������ �Է��Ͻÿ�:");
		int englishScore = inputScore();
		System.out.print("-������ �Է��Ͻÿ�:");
		int computScore = inputScore();
		
		while(computScore>=0||koreanScore>=0||englishScore>=0){
			
			if(computScore>100||koreanScore>100||englishScore>100){
				System.out.println("����: 100 �� �Ѿ, �������� ������ �ƴ� ���� �ֽ��ϴ�.");
			
			}
	
			else{
				koreanGrade = score2Grade(koreanScore);
				koreanGradePoint = grade2Point(koreanGrade);
				System.out.println("[�� ��]���� :"+koreanScore+", ����:"+koreanGrade+", ����:"+koreanGradePoint);

				englishGrade = score2Grade(englishScore);
				englishGradePoint = grade2Point(englishGrade);
				System.out.println("[�� ��]���� :"+englishScore+", ����:"+englishGrade+", ����:"+ englishGradePoint);

				computGrade = score2Grade(computScore);
				computGradePoint = grade2Point(computGrade);
				System.out.println("[��ǻ��]���� :"+computScore+", ����:"+computGrade+", ����"+computGradePoint);
				
			}
			System.out.print("-������ �Է��Ͻÿ�:");
			koreanScore = inputScore();
			System.out.print("-������ �Է��Ͻÿ�:");
			englishScore = inputScore();
			System.out.print("-������ �Է��Ͻÿ�:");
			computScore = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");
	}
}
