package Unit_2;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1 > 10) {
			int v2 = v1 - 10;
		}
		int v3 = v1 + 5;//v2 + 5;
		// v2 는 위에 scope에 벗어나 사용할 수 없다. 
	}
}
