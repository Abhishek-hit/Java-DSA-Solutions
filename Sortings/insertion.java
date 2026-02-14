package Sortings;

public class insertion {
    public static void main(String[] args) {
        int[] arr={5,5,12,42,36,45,8,4};
        for (int i=0;i< arr.length-1;i++){
            int curr=i;
            int prev=i-1;
            while (prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }  for (int val:arr){
            System.out.print(val+" " );
        }

    }
}
