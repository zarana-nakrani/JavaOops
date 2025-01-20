package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        boolean result = naiveTriplet(array);
        System.out.println(result);
    }

    public static boolean naiveTriplet(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int x = nums[i] * nums[i];
                    int y = nums[j] * nums[j];
                    int z = nums[k] * nums[k];
                    if(x + y == z || x + z == y || y + z == x ) return true;
                }
            }
        }
        return false;
    }

    //one approach is to sort the array in ascending order & then check in the pairing cuz sqaure of a number cannot be greater than addition of square of 2 numbers greater than the 1st number
    public static void additionalArray(int[] nums) {
        int[] squares = new int[nums.length];
        for(int i = 0; i< nums.length; i++) {
            squares[i] = nums[i] * nums[i];
        }

        for(int j = 0; j < nums.length; j++) {

        }

    }

}