package Unit_3;

public class InputDataCheckNaNExample1 {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 1000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
	}
}
