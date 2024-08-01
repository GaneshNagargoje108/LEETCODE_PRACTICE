package practice_leetcode_problems;
import java.util.*;
public class Reverse_inteeger_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer number:");
		int x = sc.nextInt();
		int res = 0 ;
		boolean isNegative = false;
		if(x<0) {
			x=-x;
			isNegative = true;
		}
		while(x>0) {
			int digit = x%10;
			x/=10;
			res = res * 10 + digit;

		}
		if(isNegative) {
			System.out.print(-res);
		}
		else {
			System.out.print(res);
		}

	}

}
