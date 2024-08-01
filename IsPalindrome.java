package practice_leetcode_problems;
import java.util.*;
public class IsPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int  x = sc.nextInt();
		int res = 0;
		boolean isPalindrome= false;
	 	int temp = x;
	 	if(x<0){
	 		isPalindrome= false;
	 	}
	 	else{
	     	while(x>0){
	         	int digit = x % 10 ;
	         	x/=10;
	             
	         	res = (res * 10 )+digit;
	     	}
	     	if(res==temp) {
	     		isPalindrome= true;
	     	}
	     	else {
	     		isPalindrome= false;
	     	}
	 	}
		if(isPalindrome==true) {
			System.out.println(temp  +" Is Palindrome");
		}
		else {
			System.out.println(temp +" Is NOT Palindrome");
		}
	}
	
	
		

}


