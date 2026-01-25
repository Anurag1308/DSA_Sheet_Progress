package foundation;

/*
Problem Statement :
Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.
An alphanumeric string is a string consisting of lowercase English letters and digits.
 */

public class LC_1796_SecondLargestIntegerInString{
    public static void main(String args[]){
        String str = "abc34165xyz";
        int result = SecondHighest(str);
        System.out.println("The second largest integer in " +str+" = "+result);
    }
    public static int SecondHighest(String s){
        int max = -1;
        int secondMax = -1;
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int digit = ch - '0';
                if(digit>max){
                    secondMax = max;
                    max = digit;

                }
                else if(digit > secondMax && digit < max)
                {
                    secondMax = digit;
                }
            }
        }
        return secondMax;
    }
}


