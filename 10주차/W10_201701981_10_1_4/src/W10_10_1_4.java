import java.util.Scanner;

public class W10_10_1_4 {
	public static Scanner scanner = new Scanner(System.in);

	public static int inputScore() {
		int score;
		score = scanner.nextInt();
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int koreanScore, englishScore, computScore;
		Student student = new Student() ;
		GPACounter gpaCounter = new GPACounter() ;
		System.out.print("> 세과목의 점수를 차례대로 입력하시오") ;
		koreanScore = inputScore() ;
		englishScore = inputScore() ;
		computScore = inputScore() ;
		while (koreanScore > 0 && englishScore > 0 && computScore > 0) {
			if (koreanScore > 100 || englishScore > 100 || computScore > 100) {
				System.out.println("오류: 점수가 100이 넘어서, 정상적인 점수가 아닙니다.") ;
			} else {
				student.setScoreKorean(koreanScore) ;
				student.setScoreEnglish(englishScore) ;
				student.setScoreComput(computScore) ;
//				처음 위 객체의 소유권을 가지는 변수를 달리 생성했는데 그렇게 하니까
//				영어 국어 컴퓨터가 각각 다른 객체에 저장되서 GPA를 구할 수 없었음.
//				객체를 하나로 통일 하니까 제대로됨
				System.out.println("[국 어] 점수: " + koreanScore + ", 학점: " + student.gradeKorean() + ", 평점: " + student.pointKorean());
				System.out.println("[영 어] 점수: " + englishScore + ", 학점: " + student.gradeEnglish() + ", 평점: "+ student.pointEnglish());
				System.out.println("[컴퓨터] 점수: " + computScore + ", 학점: " + student.gradeComput() + ", 평점: " + student.pointComput());
				System.out.println("이 학생의 평균평점은 " + student.GPA() + " 입니다.");	
				gpaCounter.count(student.GPA()) ;
			}
			System.out.print("> 세과목의 점수를 차례대로 입력하시오");
			koreanScore = inputScore();
			englishScore = inputScore();
			computScore = inputScore();
		}
		System.out.println("음의 점수가 입력되어 종료합니다.");
		System.out.println();
		System.out.println("평균 평점이 3.0 이상인 학생은 " + gpaCounter.numberOfGPA3() + " 명 입니다.");
		System.out.println("평균 평점이 2.0이상 3.0미만인 학생은 " + gpaCounter.numberOfGPA2() + " 명 입니다.");
		System.out.println("평균 평점이 1.0이상 2.0미만인 학생은 " + gpaCounter.numberOfGPA1() + "명 입니다.");
		System.out.println("평균 평점이 1.0미만인 학생은" + gpaCounter.numberOfGPA0() + " 명 입니다.");
		System.out.println("프로그램을 종료합니다.");
	}
}
