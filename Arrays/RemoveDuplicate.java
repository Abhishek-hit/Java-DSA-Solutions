package Arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
    static int remove(int arr[]){
        int n=arr.length;
        int count=0;
        for (int i=0;i<n;i++){
            if (arr[i]!=arr[i+1]){
                arr[count]=arr[i];
                count++;
            }
        }
        return arr[count];
    }

    public static void main(String[] args) {
        int [] arr={1,22,33,2,2,6,8,9,9,16};
        System.out.println (remove (arr) );

}
}
