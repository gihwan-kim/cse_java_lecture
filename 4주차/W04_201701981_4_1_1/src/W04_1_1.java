import java.util.Scanner;

public class W04_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ds = new Scanner(System.in);
		char answer;
		System.out.println("이차방정식을 풀 겠습니까?");
		System.out.println(",풀기를 원하면 Y를 입력하시오");
		
		answer = ds.next().charAt(0);
		while(answer== 'Y'){
		System.out.println("이차방정식을 계산합니다!");
		System.out.println("이차방정식을 계산하겠습니까?");
		answer = ds.next().charAt(0);//키보드에서 글자하나 입력받음.
		}
		System.out.println("프로그램을 종료합니다.");
		ds.close();
	}

}
