package practice_leetcode_problems;

import java.util.Scanner;

public class NumberOfSeniorCitizens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of citizens: ");
        int n = sc.nextInt();
        sc.nextLine();  
        String[] details = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter details for citizen " + (i + 1) + ": ");
            details[i] = sc.nextLine();
        }
        int ans = countSeniors(details);
        System.out.println("Number of senior citizens: " + ans);
        sc.close();
    }

    public static int countSeniors(String[] details) {
        int count = 0;
        int x = details.length;
        for (int i = 0; i < x; i++) {
            String substr = details[i].substring(11, 13);
            int age = Integer.parseInt(substr);
            if (age > 60) {
                count++;
            }
        }
        return count;
    }
}