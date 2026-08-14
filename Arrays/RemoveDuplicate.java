package Arrays;

import java.util.Arrays;

public class RemoveDuplicate {
    static int remove(int arr[]) {
        int n = arr.length;
        Arrays.sort (arr);

        // Agar array empty hai ya sirf 1 element hai, toh wahi length return kardo
        if (n == 0 || n == 1) {
            return n;
        }

        int count = 0;

        // Loop n-1 tak chalega taaki Index Out of Bounds na ho
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[count] = arr[i];
                count++;
            }
        }

        // Aakhri element ko array mein daalna zaroori hai
        arr[count] = arr[n - 1];
        count++;

        // Naye array ka size return karenge
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 22,2, 33, 2, 2, 6, 8, 9, 9, 16};

        // remove function humein array ki nayi length dega
        int newLength = remove(arr);

        // Updated array ko print karne ke liye new length tak loop chalayenge
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}