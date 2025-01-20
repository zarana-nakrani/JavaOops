package Methods;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Find the factorial of: ");
        int num = in.nextInt();
        int result = findFactorial(num);
        System.out.println("Factorial of "+ num + " is " + result);
    }

    public static int findFactorial(int num) {
        if(num <= 1) return 1;
        else {
            return num * findFactorial(num - 1);
        }
    }
}
