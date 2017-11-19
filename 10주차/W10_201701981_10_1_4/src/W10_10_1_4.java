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
		System.out.print("> �������� ������ ���ʴ�� �Է��Ͻÿ�") ;
		koreanScore = inputScore() ;
		englishScore = inputScore() ;
		computScore = inputScore() ;
		while (koreanScore > 0 && englishScore > 0 && computScore > 0) {
			if (koreanScore > 100 || englishScore > 100 || computScore > 100) {
				System.out.println("����: ������ 100�� �Ѿ, �������� ������ �ƴմϴ�.") ;
			} else {
				student.setScoreKorean(koreanScore) ;
				student.setScoreEnglish(englishScore) ;
				student.setScoreComput(computScore) ;
//				ó�� �� ��ü�� �������� ������ ������ �޸� �����ߴµ� �׷��� �ϴϱ�
//				���� ���� ��ǻ�Ͱ� ���� �ٸ� ��ü�� ����Ǽ� GPA�� ���� �� ������.
//				��ü�� �ϳ��� ���� �ϴϱ� ����ε�
				System.out.println("[�� ��] ����: " + koreanScore + ", ����: " + student.gradeKorean() + ", ����: " + student.pointKorean());
				System.out.println("[�� ��] ����: " + englishScore + ", ����: " + student.gradeEnglish() + ", ����: "+ student.pointEnglish());
				System.out.println("[��ǻ��] ����: " + computScore + ", ����: " + student.gradeComput() + ", ����: " + student.pointComput());
				System.out.println("�� �л��� ��������� " + student.GPA() + " �Դϴ�.");	
				gpaCounter.count(student.GPA()) ;
			}
			System.out.print("> �������� ������ ���ʴ�� �Է��Ͻÿ�");
			koreanScore = inputScore();
			englishScore = inputScore();
			computScore = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �����մϴ�.");
		System.out.println();
		System.out.println("��� ������ 3.0 �̻��� �л��� " + gpaCounter.numberOfGPA3() + " �� �Դϴ�.");
		System.out.println("��� ������ 2.0�̻� 3.0�̸��� �л��� " + gpaCounter.numberOfGPA2() + " �� �Դϴ�.");
		System.out.println("��� ������ 1.0�̻� 2.0�̸��� �л��� " + gpaCounter.numberOfGPA1() + "�� �Դϴ�.");
		System.out.println("��� ������ 1.0�̸��� �л���" + gpaCounter.numberOfGPA0() + " �� �Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");
	}
}
