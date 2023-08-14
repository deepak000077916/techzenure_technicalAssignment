package JavaBasics;
import java.util.Scanner;
public class GreaterOfTwoNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		int a,b; 
		a=s.nextInt(); 
		b=s.nextInt(); 
		if (a>b) {
			System.out.print("A Is Greater");
		} 
		else {
			System.out.print("B is Greater");
		}

	}

}
