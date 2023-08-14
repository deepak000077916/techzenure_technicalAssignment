package JavaBasics; 
import java.util.Scanner;
public class PalindromeOfaWord {
	public static void main(String[] args) { 
		Scanner s=new Scanner(System.in);  
		System.out.println("Enter a string");
		String str= s.nextLine();
	    String reverseStr = "";
	    int strLength = str.length();
	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }
	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println("Palindrome String");
	    }
	    else {
	      System.out.println("not a Palindrome String.");
	    }
	}

}
