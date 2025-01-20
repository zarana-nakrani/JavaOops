import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = in.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = in.nextInt();
        int smallest = findSmallestOfThree(num1, num2, num3);
        System.out.println("Smallest of " + num1 + ", " + num2 + ", " + num3 + " is " + smallest);
        int largest = findLargestOfThree(num1, num2, num3);
        System.out.println("Largest of " + num1 + ", " + num2 + ", " + num3 + " is " + largest);
    }

    public static int findSmallestOfThree(int num1, int num2, int num3) {
        if(num1 < num2 && num1 < num3){
            return num1;
        } else if (num2 < num3) {
            return num2;
        } else if(num3 < num1 && num3 < num2) {
            return num3;
        } else {
            return 0;
        }
    }

    public static int findLargestOfThree(int num1, int num2, int num3){
        if(num1 > num2 && num1 > num3){
            return num1;
        } else if (num2 > num3) {
            return num2;
        } else if (num3 > num2) {
            return num3;
        } else {
            return 0;
        }
    }
}