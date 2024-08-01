package practice_leetcode_problems;
import java.util.*;
public class ROMAN_TO_INT_USING_LOOPS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roman number:");
		String s = sc.next();
		int ans= romanToInt(s);
		System.out.println("The integer number of "+ s +" is "+ ans);

	}
	public static int romanToInt(String s) {
        String[] romanArray = new String[]{"M", "D", "C", "L", "X", "V", "I"};
        int[] intArray = new int[]{1000, 500, 100, 50, 10, 5, 1};
        int sum = 0;
        int prevValue = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentIndex = 0;
            
            // Find the index of the current character in the romanArray
            for (int j = 0; j < romanArray.length; j++) {
                if (romanArray[j].equals(String.valueOf(currentChar))) {
                    currentIndex = j;
                    break;
                }
            }
            
            int currentValue = intArray[currentIndex];
            
            // If the current value is greater than the previous value, subtract twice the previous value
            if (currentValue > prevValue) {
                sum += currentValue - 2 * prevValue;
            } else {
                sum += currentValue;
            }
            
            prevValue = currentValue;
        }
        
        return sum;
    }

}
