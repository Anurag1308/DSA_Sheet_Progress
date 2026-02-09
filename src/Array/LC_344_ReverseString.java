package Array;

import java.util.Arrays;

public class LC_344_ReverseString {
    public static void main(String[] args) {
//        char[] str = {'h', 'e', 'l', 'l', 'o'};
        char[] str = {'K', 'a', 'n', 'a', 'k'};
        System.out.println("Original array : "+ Arrays.toString(str));
        char[] ans = reverseString(str);
        System.out.println("Modified array : "+ Arrays.toString(str));

    }
    public static char[] reverseString(char[] s){
        int start = 0;
        int end = s.length - 1;

        while(start < end){
            if(s[start] == s[end]){
                start++;
                end--;
                continue;
            }
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        return s;
    }
}
