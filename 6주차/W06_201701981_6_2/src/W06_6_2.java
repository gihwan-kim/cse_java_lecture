
public class W06_6_2 {
	private static double mySine(double x) {
		
		double xSquare = x * x;
		double currentSine = x;
		double nextSine;
		int n = 1;
		double sineValue = currentSine;
		while (Math.abs(currentSine) >= 0.000001) {
			
			nextSine = -currentSine * xSquare / (double) ((n + 1) * (n + 2));
			n = n + 2;
			currentSine = nextSine;
			sineValue = sineValue + nextSine;
			
			
		}
		
		return sineValue;
	}

	private static void printAsterisks(double sineValue) {
		
		int k = 1;
		int numberOfAsterisks = (int)((sineValue * 40.0) + 0.5);
		while (k <= numberOfAsterisks) {
			System.out.print("*");
			k++;
		}
		
		return;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int yourdegree = 1;
		while (yourdegree <= 176) {
			if(yourdegree<=9){
				System.out.print("sine(00" + yourdegree + "µµ)");
			}
			else if(yourdegree<99){
				System.out.print("sine(0" + yourdegree + "µµ)");
			}
			else{
			System.out.print("sine(" + yourdegree + "µµ)");
			}
			double radian = yourdegree * 3.141592 / 180.0 ;
			double asineValue = mySine(radian);
			printAsterisks(asineValue);
			System.out.println();
			yourdegree = yourdegree + 5;
		}
	}

}
