package JavaBasics;
import java.util.Scanner;

public class D3DisplayOddNum {

	public static void main(String[] args) {  
		Scanner s=new Scanner(System.in);  
		int Num=s.nextInt(); 
		for(int i = 1; i <= Num; i++) 
		{
			System.out.print(2 * i - 1+"   ");
		}
	}

}
