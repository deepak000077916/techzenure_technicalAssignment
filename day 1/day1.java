package JavaBasics;

import java.util.Scanner;
public class day1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		System.out.print("enter the no of pizzas bought :"); 
		int a=s.nextInt();
		System.out.print("enter the no of puffs bought :");
		int b=s.nextInt();
		System.out.print("enter the no of cool drinks bought :");
		int c=s.nextInt(); 
		System.out.println("Bill details"); 
		System.out.println("No of Pizzas "+a+"        "+"Cost:"+a*100);
		System.out.println("No of Puffs "+b+"         "+"Cost:"+b*20);
		System.out.println("No of Cool Drinks "+b+"   "+"Cost:"+c*10); 
		System.out.println();  
		System.out.print("Total price=");
		System.out.println((a*100)+(b*20)+(c*10)); 
		System.out.print("ENJOY THE SHOW");
		
		

	}

}
