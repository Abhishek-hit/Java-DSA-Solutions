package Arrays;

import java.util.Arrays;

public class largestelement {
    public static void main(String[] args) {
        int [ ] arr={12,15,20,8,3,9,56,5,7};
        int largest=-1;

        for (int i=0;i<arr.length;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }

        } System.out.println (largest );
//        System.out.println (Arrays.toString (arr));
    }
}
