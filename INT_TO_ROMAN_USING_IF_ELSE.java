package practice_leetcode_problems;
import java.util.*;

public class INT_TO_ROMAN_USING_IF_ELSE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number:");
        int num = sc.nextInt();
        System.out.println("Roman numeral of " + num + " is: ");
        String roman = intToRoman(num);
        System.out.println(roman);  
    }

    public static String intToRoman(int num) {  
        int no_at_thousand_place = num / 1000;
        int no_at_hundreds_place = (num % 1000) / 100;
        int no_at_tens_place = (num % 100) / 10; 
        int no_at_ones_place = num % 10;
        String THP_roman = "";
        String HP_roman = "";
        String TP_roman = "";
        String UP_roman = "";

        // Thousand place
        if (no_at_thousand_place > 0) {
            THP_roman = "M".repeat(no_at_thousand_place); 
        }

        // Hundreds place
        if (no_at_hundreds_place > 0) {
            if (no_at_hundreds_place <= 3) {
                HP_roman = "C".repeat(no_at_hundreds_place); 
            } else if (no_at_hundreds_place == 4) {
                HP_roman = "CD";
            } else if (no_at_hundreds_place == 5) {
                HP_roman = "D";
            } else if (no_at_hundreds_place < 9 && no_at_hundreds_place > 5) {
                HP_roman = "D" + "C".repeat(no_at_hundreds_place - 5); 
            } else if (no_at_hundreds_place == 9) {
                HP_roman = "CM";
            }
        }

        // Tens place
        if (no_at_tens_place > 0) {
            if (no_at_tens_place <= 3) {
                TP_roman = "X".repeat(no_at_tens_place); 
            } else if (no_at_tens_place == 4) {
                TP_roman = "XL";
            } else if (no_at_tens_place == 5) {
                TP_roman = "L";
            } else if (no_at_tens_place < 9 && no_at_tens_place > 5) {
                TP_roman = "L" + "X".repeat(no_at_tens_place - 5); 
            } else if (no_at_tens_place == 9) {
                TP_roman = "XC";
            }
        }

        // Ones place
        if (no_at_ones_place > 0) { 
            if (no_at_ones_place <= 3) {
                UP_roman = "I".repeat(no_at_ones_place);
            } else if (no_at_ones_place == 4) {
                UP_roman = "IV";
            } else if (no_at_ones_place == 5) {
                UP_roman = "V";
            } else if (no_at_ones_place < 9 && no_at_ones_place > 5) {
                UP_roman = "V" + "I".repeat(no_at_ones_place - 5); 
            } else if (no_at_ones_place == 9) {
                UP_roman = "IX";
            }
        }

        return THP_roman + HP_roman + TP_roman + UP_roman;
    }
}
