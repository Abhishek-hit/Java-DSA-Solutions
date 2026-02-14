package Sortings;

public class selection {
    public static void main(String[] args) {
        int[] arr={5,6,14,2,1,9,85,10,15};
        for (int i=0;i< arr.length-1;i++){
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        for (int val:arr){
            System.out.print ( val+" ");
        }
    }
}
