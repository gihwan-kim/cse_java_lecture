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
		System.out.print(">������ �Է��Ͻÿ�:");
		score = inputScore();
		while(score>=0){
			if(score>100){
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else{
			numberOfStudents ++;
			ascore[i]=score;
			i++;
			}
		System.out.print("������ �Է��Ͻÿ�:");
		score = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� "+numberOfStudents+ " ���� ������ �ԷµǾ����ϴ�.");
		System.out.println();
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		while(k<numberOfStudents){
		System.out.println("["+k+"] "+ascore[k]);
		k++;
		}
		System.out.println();
		System.out.println("���α׷��� �����մϴ�.");
		
		
	}

}
