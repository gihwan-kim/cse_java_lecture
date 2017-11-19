import java.util.Scanner;
public class W08_8_1 {
	private static Scanner scanner = new Scanner(System.in);
	private static final int MAX_SIZE=100;

	private static int inputScore(){
		int score = scanner.nextInt();
		return score;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score;
		int i=0;
		int k=0;
		int numberOfStudents = 0;
		int[] ascore = new int[MAX_SIZE];
		System.out.print(">점수를 입력하시오:");
		score = inputScore();
		while(score>=0){
			if(score>100){
				System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else{
			numberOfStudents ++;
			ascore[i]=score;
			i++;
			}
		System.out.print("성적을 입력하시오:");
		score = inputScore();
		}
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("모두 "+numberOfStudents+ " 명의 성적이 입력되었습니다.");
		System.out.println();
		System.out.println("입력된 성적은 다음과 같습니다.");
		while(k<numberOfStudents){
		System.out.println("["+k+"] "+ascore[k]);
		k++;
		}
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
		
		
	}

}
