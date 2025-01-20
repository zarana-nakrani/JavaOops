package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        int start = 0;
        int end = arr.length - 1;
        selection(arr, start, end);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void selection(int[] arr, int start, int end){
        int maxIndex = findMax(arr, end);
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[end];
        arr[end] = temp;
        if(start == end) return;
        end = end - 1;
        selection(arr, start, end);
    }

    static int findMax(int[] arr, int end){
        int temp = arr[0];
        int index = 0;
        for(int i = 1; i <= end; i++){
            if(arr[i] > temp) {
                temp = arr[i];
                index = i;
            }
        }
        return index;
    }
}
