package JavaBasics;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner s=new Scanner(System.in); 
		int a; 
		a=s.nextInt(); 
		int rem=a%2; 
		boolean ans=rem==0; 
		if (ans) {
			System.out.print("Even");
		} 
		else {
			System.out.print("Odd");
		}
				

	}

}
