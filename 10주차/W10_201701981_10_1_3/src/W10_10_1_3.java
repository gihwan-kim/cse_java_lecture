import java.util.Scanner ;
public class W10_10_1_3 {
	private static Scanner scanner = new Scanner(System.in);
	private static int inputScore(){
		int score ;
		score = scanner.nextInt() ;
		return score ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int koreanScore ;
		int englishScore ;
		int computScore ;
		Student korean = new Student() ;
		Student english = new Student() ;
		Student comput = new Student() ;
		System.out.println("> �� ����(����,����,��ǻ��) �� ������ ���ʷ� �Է��մϴ�.");
		System.out.print("-������ �Է��Ͻÿ�:");
		koreanScore = inputScore() ;
		System.out.print("-������ �Է��Ͻÿ�:");
		englishScore = inputScore() ;
		System.out.print("-������ �Է��Ͻÿ�:");
		computScore = inputScore() ;
		while(koreanScore > 0&&englishScore > 0 && computScore > 0){
			if(koreanScore > 100||englishScore > 100 || computScore > 100){
				System.out.println("���� : 100�� �Ѿ �������� ������ �ƴ� ���� �ֽ��ϴ�.");
			}
			else{
				korean.setScore(koreanScore);
				System.out.println("[�� ��] ����:" + koreanScore +", ����: "+ korean.score2Grade()) ;
				english.setScore(englishScore);
				System.out.println("[�� ��] ����:" + englishScore +", ����: "+ english.score2Grade()) ;
				comput.setScore(computScore);
				System.out.println("[��ǻ��] ����:"+ computScore +", ����: "+ comput.score2Grade()) ;
			} 
			System.out.println("> �� ����(����,����,��ǻ��) �� ������ ���ʷ� �Է��մϴ�.");
			System.out.print("-������ �Է��Ͻÿ�:" );
			koreanScore = inputScore() ;
			System.out.print("-������ �Է��Ͻÿ�:") ;
			englishScore = inputScore() ;
			System.out.print("-������ �Է��Ͻÿ�:") ;
			computScore = inputScore() ;	
		}
		System.out.println("������ ������ �ԷµǾ� �Է��� �����մϴ�. ") ;
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");
	}

}
