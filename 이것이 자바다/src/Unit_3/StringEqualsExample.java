package Unit_3;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "정동하";
		String strVar2 = "정동하";
		String strVar3 = new String("정동하");

		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.contentEquals(strVar2));
		System.out.println(strVar1.contentEquals(strVar3));
	}
}
