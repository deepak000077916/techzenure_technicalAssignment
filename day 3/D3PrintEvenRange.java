package JavaBasics; 
import java.util.Scanner;

public class D3PrintEvenRange {

	public static void main(String[] args) { 
		Scanner s=new Scanner(System.in); 
		System.out.print("enter the first no: ");
		int FirstNum=s.nextInt();  
		System.out.print("enter the last no: ");
		int SecNum=s.nextInt();  
		System.out.println("Even Numbers between "+FirstNum+"and "+SecNum); 
		if (SecNum<FirstNum) {
			System.out.print("second number should be greater than first number");  
			
		}
		while (FirstNum<(SecNum-1)) { 
			FirstNum++; 
			if (FirstNum%2==0) {
				System.out.print(FirstNum+"  "); 
				
			} 
			
		}

	}

}
