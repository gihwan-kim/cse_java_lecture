import java.util.Scanner;
public class W07_7_4 {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counta = 0;
		int countb = 0;
		int countc = 0;
		int countd = 0;
		int countf= 0;
		char koreanGrade,englishGrade,computGrade ;
		double GPA,koreanGradePoint, englishGradePoint, computGradePoint;
		System.out.print("> �� ����(����, ����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�");
		int koreanScore = inputScore(); int englishScore = inputScore(); int computScore = inputScore();
		
		while(koreanScore>=0||englishScore>=0||computScore>=0){
			if(koreanScore>100||englishScore>100||computScore>100){
				System.out.println("���� : 100�� �Ѿ �������� ������ �ƴմϴ�.");
			}
			else {

				koreanGrade = score2Grade(koreanScore)    ;
				koreanGradePoint = grade2point(koreanGrade);
				System.out.println("[�� ��] ����:" + koreanScore + " ����:"+ koreanGrade +" ����:"+koreanGradePoint);
				
				englishGrade = score2Grade(englishScore)  ;
				englishGradePoint = grade2point(englishGrade);
				System.out.println("[�� ��] ����:" + englishScore + " ����:"+ englishGrade +" ����:"+englishGradePoint);
				
				computGrade = score2Grade(computScore)    ;
				computGradePoint = grade2point(computGrade);
				System.out.println("[��ǻ��] ����:" + computScore + " ����:"+ computGrade +" ����:"+computGradePoint);
				
				GPA = calcGPA(koreanGradePoint, englishGradePoint,computGradePoint);
				System.out.println("�� �л��� ��� ������ :"+GPA+" �Դϴ�.");
			
					if(GPA>=4.0){
					counta ++;
					}
				
					else if(GPA>=3.0){
						countb = countb + 1;
						
					}
					else if(GPA>=2.0){
						countc ++;
					}
					else if(GPA>=1.0){
						countd ++;
					}
					else {
						countf ++;
					}
			
				}
			System.out.print("> �� ����(����, ����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�");
			koreanScore = inputScore(); englishScore = inputScore(); computScore = inputScore();
		}
		System.out.println("���� ������ �������� �����մϴ�.");
		System.out.println();
		System.out.println("��������� 4.0�̻��� �л���"+ counta +"���Դϴ�.");
		System.out.println("��������� 3.0�̻��� 4.0�̸� �л���"+ countb +"���Դϴ�.");
		System.out.println("��������� 2.0�̻��� 3.0�̸� �л���"+ countc +"���Դϴ�.");
		System.out.println("��������� 1.0�̻��� 2.0�̸� �л���"+ countd +"���Դϴ�.");
		System.out.println("��������� 1.0�̸��� �л���"+ countf +"���Դϴ�.");
	}
	private static int inputScore(){
		int score = scanner.nextInt();
		return score;
		
	}
	private static char score2Grade(int score){
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
	private static double grade2point(char grade){
		double gradePoint;
		if(grade=='A'){
			gradePoint = 4.0;
		}
		else if(grade=='B'){
			gradePoint = 3.0;
		}
		else if(grade=='C'){
			gradePoint = 2.0;
		}
		else if(grade=='D'){
			gradePoint = 1.0;
		}
		else {
			gradePoint = 0.0;
		}
		return gradePoint;
	}
	private static double calcGPA (double koreanGradePoint, double englishGradePoint, double computGradePoint ){
		
		return ((koreanGradePoint+englishGradePoint+computGradePoint)/3.0);
	}

}
