package Methods;

import java.util.Scanner;

public class PalindromeOfNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number to check if its palindrome or not: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
//        if(num == palindromeChecker(num)) System.out.println(num + " is palindrome number");
        if(usingString(num)) System.out.println(num + " is palindrome number");
        else System.out.println(num + " is not palindrome number");
    }

    public static int palindromeChecker(int num){
        int temp = num % 10;
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        return reverse;
    }

    public static boolean usingString(int num) {
        String temp = String.valueOf(num);
        int len = temp.length();
        for(int i = 0; i <= len / 2; i++ ){
            if(temp.charAt(i) != temp.charAt(len - i - 1)) return false;
        }
        return true;
    }
}
