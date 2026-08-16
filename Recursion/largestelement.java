package Recursion;



public class largestelement {
    // Recursive Function
    public static int findLargest(int[] arr, int inx) {
        // 1. Base Case:
        //  (U-Turn Point)
        if (inx == arr.length - 1) {
            return arr[inx];
        }
        // 2. Faith
        //  Pause (Wait)
        int maxInRest = findLargest(arr, inx + 1);
        if (arr[inx] > maxInRest) {
            return arr[inx];
        } else {
            return maxInRest;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 15, 20, 8, 3, 9, 56, 5, 7};

        int largest = findLargest(arr, 0);

        System.out.println("Largest element is: " + largest);
    }
}
