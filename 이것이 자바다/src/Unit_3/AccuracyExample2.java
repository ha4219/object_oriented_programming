package Unit_3;

public class AccuracyExample2 {
	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp/10.0;
		
		System.out.println("사과 한개에서 \n0.7 조각을 빼면, \n " + result + "조각이 남는다.");
	}
}
