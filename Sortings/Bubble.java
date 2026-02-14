package Sortings;

public class Bubble {
    public static void main(String[] args) {
        int [] arr={1,21,3,6,8,15,26};
        //loop for cycles
        for (int i=0;i< arr.length-1;i++){
            // for data compare ke liye
            for (int j=0;j< arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        for (int val:arr){
            System.out.print(val+" " );
        }
    }
}
