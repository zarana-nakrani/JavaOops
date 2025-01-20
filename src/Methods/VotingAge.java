package Methods;

import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        checkEligibility(age);
    }

    public static void checkEligibility(int age){
        if(age >= 18){
            System.out.println("You are eligible  to vote.");
        }
        else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
