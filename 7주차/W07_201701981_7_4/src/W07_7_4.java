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
		System.out.print("> 세 과목(국어, 영어, 컴퓨터)의 점수를 차례로 입력하시오");
		int koreanScore = inputScore(); int englishScore = inputScore(); int computScore = inputScore();
		
		while(koreanScore>=0||englishScore>=0||computScore>=0){
			if(koreanScore>100||englishScore>100||computScore>100){
				System.out.println("오류 : 100이 넘어서 정상적인 점수가 아닙니다.");
			}
			else {

				koreanGrade = score2Grade(koreanScore)    ;
				koreanGradePoint = grade2point(koreanGrade);
				System.out.println("[국 어] 점수:" + koreanScore + " 학점:"+ koreanGrade +" 평점:"+koreanGradePoint);
				
				englishGrade = score2Grade(englishScore)  ;
				englishGradePoint = grade2point(englishGrade);
				System.out.println("[영 어] 점수:" + englishScore + " 학점:"+ englishGrade +" 평점:"+englishGradePoint);
				
				computGrade = score2Grade(computScore)    ;
				computGradePoint = grade2point(computGrade);
				System.out.println("[컴퓨터] 점수:" + computScore + " 학점:"+ computGrade +" 평점:"+computGradePoint);
				
				GPA = calcGPA(koreanGradePoint, englishGradePoint,computGradePoint);
				System.out.println("이 학생의 평균 평점은 :"+GPA+" 입니다.");
			
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
			System.out.print("> 세 과목(국어, 영어, 컴퓨터)의 점수를 차례로 입력하시오");
			koreanScore = inputScore(); englishScore = inputScore(); computScore = inputScore();
		}
		System.out.println("음의 정수가 나왔으니 종료합니다.");
		System.out.println();
		System.out.println("평균평점이 4.0이상인 학생은"+ counta +"명입니다.");
		System.out.println("평균평점이 3.0이상인 4.0미만 학생은"+ countb +"명입니다.");
		System.out.println("평균평점이 2.0이상인 3.0미만 학생은"+ countc +"명입니다.");
		System.out.println("평균평점이 1.0이상인 2.0미만 학생은"+ countd +"명입니다.");
		System.out.println("평균평점이 1.0미만인 학생은"+ countf +"명입니다.");
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
