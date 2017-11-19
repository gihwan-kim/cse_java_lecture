public class W04_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int factorial =1;
		int givenN = 5;
		int k=1;
					while(k<=givenN){
					
					factorial = factorial*k;
					k = k+1;
					}
				System.out.println(givenN+"! 은 " + factorial+" 입니다.");
			}
	}

