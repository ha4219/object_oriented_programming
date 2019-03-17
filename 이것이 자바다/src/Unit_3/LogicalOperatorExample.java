package Unit_3;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';
		
		if((charCode>=65) & (charCode<=90)) {
			System.out.println("대문자 이군요");
		}
		
		if((charCode>=97) && (charCode<=122)) {
			System.out.println("소문자 이군요");
		}
		
		if(!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9");
		}
		
		int value = 6;
		//계산 속도차이 || && 가 더빠르다 앞에 조건을 보고 바로 판단
		if((value%2==0) | (value%3)==0) {
			System.out.println("2 또는 3의 배수");
		}
		
		if((value%2==0) || (value%3)==0) {
			System.out.println("2 또는 3의 배수");
		}
	}
}
