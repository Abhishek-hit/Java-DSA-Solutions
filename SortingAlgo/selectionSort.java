package SortingAlgo;

import java.util.Arrays; // Arrays.toString() ke liye

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 15, 3, 9, 5, 12, 6, 58, 89};
        int n = arr.length; // Array ki length store ki

        for (int i = 0; i < n - 1; i++) {
            // Hum assume karte hain ki i par minimum element hai
            int minIndex = i;

            // Inner loop: i + 1 se lekar end tak minimum element ka index dhundo
            for (int j = i + 1; j < n; j++) { // FIX 2: Loop boundary (n) use kiya
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Naya minimum index mil gaya
                }
                // FIX 3: Selection Sort me swap inner loop ke andar nahi hota
            }

            // FIX 3: Swap sirf ek baar hoga, jab inner loop poora ho jaye
            // Agar minIndex original i se alag hai, to swap karo
            if (minIndex != i) {
                // FIX 1: Manual swap (temp variable se)
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}