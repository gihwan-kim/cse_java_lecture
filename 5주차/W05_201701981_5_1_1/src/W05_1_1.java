import java.util.Scanner;

public class W05_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade;
		Scanner scanner = new Scanner(System.in);
		System.out.print("성적을 입력하세요 : ");
		grade = scanner.nextInt();
		while(grade>=0){
			if(grade>100){
				System.out.println("오류 : 최대점수 100을 넘었습니다.");
			}
			else{
				
			}
				System.out.print("성적을 입력하세요 : ");
				grade = scanner.nextInt();

		}
		System.out.println("성적 입력을 종료합니다.");
		scanner.close();
	}

}
