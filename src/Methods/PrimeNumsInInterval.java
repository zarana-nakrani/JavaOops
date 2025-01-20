package Methods;

import java.util.Arrays;
import java.util.Scanner;
import Methods.PrimeNumberChecker;
//find all prime numbers in a given interval
public class PrimeNumsInInterval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int[] result = primeNums(start, end);
        System.out.println(Arrays.toString(result));
    }

    public static int[] primeNums(int start, int end){
        int[] result = new int[(end-start) / 2];
        int i, j;
        if(start <= 2) {
            result[0] = 2;
            for(i = 3, j = 1; i <= end; i = i+2){
                if(PrimeNumberChecker.betterApproach(i))
                {
                    result[j] = i;
                    j++;
                }
            }
        }
        else if(start % 2 == 0){
            for(i=start+1, j = 0; i<=end; i += 2){
                if(PrimeNumberChecker.betterApproach(i)){
                    result[j] = i;
                    j++;
                }
            }
        }
        else {
            for(i=start, j = 0; i<=end; i += 2, j++ ){
                if(PrimeNumberChecker.betterApproach(i)) result[j] = i;
            }
        }
        return result;
    }
}
