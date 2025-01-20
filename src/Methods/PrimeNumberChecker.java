package Methods;

import java.util.Scanner;
import java.lang.*;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check if its a prime number or not");
        int num = in.nextInt();
        boolean result = thirdApproach(num);
        System.out.println(result);
    }

    public static boolean bruteForceApproach(int num) {
        for(int i = 2; i< num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    //check from 2 to n/2 since a number cannot be divisible by a number greater half of its own
    public  static boolean betterApproach(int num){
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    //check till n^1/2 because a larger factor of n must be a multiple of a smaller factor that has been already checked.
    public static boolean thirdApproach(int num) {
        System.out.println(Math.sqrt(num));
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }


}
