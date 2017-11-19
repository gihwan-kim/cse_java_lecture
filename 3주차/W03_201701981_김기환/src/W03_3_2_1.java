
public class W03_3_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenN;
		int count;
		int sum;
		sum=0;
		count=1;
		givenN=5;
		while(count<=givenN){
			sum = sum+count;
			System.out.println("1부터 " + count +"까지의 합은"+sum+"이다.");
			count = count + 1;
		}
	}

}
