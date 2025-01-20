package Binary_Search;

public class CeilingFloor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 19};
        int target = 7;
        int ceiling = ceilingOfANumber(arr, target);
        int floor = floorOfANumber(arr, target);
        System.out.println("Ceiling of a number: "+ ceiling);
        System.out.println("Floor of a number: "+ floor);
    }

    public static int ceilingOfANumber(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        //what if the target element is larger than the largest number than return -1
        if(target > arr[high]) return -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return arr[mid];
            else if(arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return arr[low];
    }

    public static int floorOfANumber(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return arr[mid];
            else if(arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return arr[high];
    }
}
