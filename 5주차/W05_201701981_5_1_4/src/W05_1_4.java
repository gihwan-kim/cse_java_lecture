import java.util.Scanner;

public class W05_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int	numberOfstudents = 0;
		int score ;
		int sumOfscore = 0;
		int numberOfA = 0;
		int numberOfB=0;
		int numberOfC=0;
		int numberOfD=0;
		int numberOfF=0;
		double average;
		System.out.println("<< ���� ó�� ���α׷��� �����մϴ�. >>");
		System.out.println();
		System.out.print("������ �Է��Ͻÿ�:");
		score = scanner.nextInt();
		while (score >= 0) {
			if((score>=90 && score<=100)){
				System.out.println("  (���� : "+ score + ", ����:A)");
				numberOfA = numberOfA + 1;
			}
			else if((score>=80&&score<=89)){
				System.out.println("  (���� : "+score+", ����:B)");
				numberOfB = numberOfB + 1;
			}
			else if((score>=70&&score<=79)){
				System.out.println("  (���� : "+score+", ����:C)");
				numberOfC = numberOfC + 1;
			}
			else if((score>=60&&score<=69)){
				System.out.println("  (���� : "+score+", ����:D)");
				numberOfD = numberOfD + 1;
			}
			else if((score>=0&&score<=59)){
				System.out.println("  (���� : "+score+", ����:F)");
				numberOfF = numberOfF + 1;
			}
			if (score > 100) {
				System.out.println("[����!]");
			} else {
				sumOfscore = sumOfscore + score;
				numberOfstudents = numberOfstudents + 1;
			}
			System.out.print("������ �Է��Ͻÿ�:");
			score = scanner.nextInt();
		}
		System.out.println("�л����� " + numberOfstudents+"���Դϴ�.");
		average = (double) sumOfscore / (double) numberOfstudents;
		System.out.println("A�� "+numberOfA+" �� �Դϴ�.");
		System.out.println("B�� "+numberOfB+" �� �Դϴ�.");
		System.out.println("C�� "+numberOfC+" �� �Դϴ�.");
		System.out.println("D�� "+numberOfD+" �� �Դϴ�.");
		System.out.println("F�� "+numberOfF+" �� �Դϴ�.");
		System.out.println("����� " + average  +" �Դϴ�.");
		System.out.println();
		System.out.println("<< ���� ó�� ���α׷��� �����մϴ�. >>");
		scanner.close();
	}

}
