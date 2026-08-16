package Recursion;

public class sumofArray {
    public static int SumOfArray(int[] arr,int inx){
        if (inx== arr.length){
            return 0;
        }
        int sum=SumOfArray (arr, inx+1);
        return arr[inx]+sum;
    }
    public static void main(String[] args) {
        int [] data={5,15,2,5,8,9};
        System.out.println (sumofArray.SumOfArray (data,0) );

    }
}
