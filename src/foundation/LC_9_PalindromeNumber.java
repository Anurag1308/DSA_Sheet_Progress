package foundation;
import java.util.*;
/*
Given an integer x, return true if x is a palindrome, and false otherwise.
 */

public class LC_9_PalindromeNumber {
    public static void main(String args[]){
        System.out.println(("Enter any number to check it is palindrome or not"));
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean result = isPalindrome(number);
        if(result)
            System.out.println("The integer "+number+" is Palindrome");
        else
            System.out.println("The integer "+number+" is not Palindrome");

    }
    public static boolean isPalindrome(int x){
        if(x<0 || (x%10 == 0 && x!=0))
            return false;
        else if(x<10)
            return true;

        String num = String.valueOf(x);
        int left = 0;
        int right = num.length()-1;
        while(left<right){
            if(num.charAt(left) != num.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
