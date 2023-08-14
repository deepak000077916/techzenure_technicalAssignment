package JavaBasics; 
import java.util.Scanner;

public class D3SumOfDigits {
  public static void main(String[] args){ 
	  Scanner s=new Scanner(System.in);
      int num=s.nextInt();  
      int temp=num;
      int sum=0;
      while (num!=0){
          int lastdigit=num%10; 
          sum=sum+lastdigit;
          num=num/10;
          
      } 
      System.out.print("sum of digits of "+temp+"="+sum);
      
  }
}

