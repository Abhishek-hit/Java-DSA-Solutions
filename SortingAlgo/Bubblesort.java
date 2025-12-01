package SortingAlgo;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr={1,15,3,9,5,12,6,58,89};
        int swap;
        for (int c=1;c<=9;c++){
            for (int b=0;b<=8-c;b++){
                if (arr[b]>arr[b+1]){
                    swap=arr[b];
                    arr[b]=arr[b+1];
                    arr[b+1]=swap;
                }
            }
        }
        System.out.println("--- Printing using Arrays.toString() ---");
        // Tarika 1 (Best and Easiest): Ek hi line mein poora array print karega
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        System.out.println("\n--- Printing using a simple for loop ---");
        // Tarika 2: Har element ko alag-alag print karega
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println(); // Nayi line ke liye

    }
}
