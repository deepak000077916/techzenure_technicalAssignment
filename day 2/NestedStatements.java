package JavaBasics;

public class NestedStatements {

	public static void main(String[] args) {
		int a=5; 
		int b=5; 
		if (a>b) {
			System.out.print("A is greater");
		}else { 
			if (b>a) {
			System.out.print("B is greater"); 
			}else {
				System.out.print("Equal");
			}
		}

	}

}
