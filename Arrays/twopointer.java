package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class twopointer {
    static boolean twopoint(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int current = arr[left] + arr[right];

            if (current == target) {
                System.out.println("Target Found: " + current);
                return true; // Match milne par True return karega
            } else if (current < target) {
                left++;
            } else {
                right--;
            }
        }

        // Mistake 2 Fix: Agar pura loop chal gaya aur target nahi mila
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {12, 13, 6, 16, 9, 36, 18};

        // Two pointer ke liye sort karna zaruri hai
        Arrays.sort(arr);

        // Method call karke print karwaya
        System.out.println("Is Target Present? : " + twopoint(arr, 25));
    }
}