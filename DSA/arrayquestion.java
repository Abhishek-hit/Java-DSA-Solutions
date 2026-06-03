package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayquestion {
    public static void main(String[] args) {
        int [] arr={10,0,8,6,0,2,0,5};
        //ouptut {10,8,6,2,5,0,0,0}
        int count=0;
        for (int i=0;i<arr.length;i++){

            if (arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
         while (count<arr.length){
             arr[count]=0;
             count++;
         }


         System.out.println (Arrays.toString (arr));
    }
}
