import java.util.Scanner;

public class W04_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ds = new Scanner(System.in);
		char answer;
		System.out.println("������������ Ǯ �ڽ��ϱ�?");
		System.out.println(",Ǯ�⸦ ���ϸ� Y�� �Է��Ͻÿ�");
		
		answer = ds.next().charAt(0);
		while(answer== 'Y'){
		System.out.println("������������ ����մϴ�!");
		System.out.println("������������ ����ϰڽ��ϱ�?");
		answer = ds.next().charAt(0);//Ű���忡�� �����ϳ� �Է¹���.
		}
		System.out.println("���α׷��� �����մϴ�.");
		ds.close();
	}

}
