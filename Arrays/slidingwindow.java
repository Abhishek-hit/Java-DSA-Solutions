package Arrays;

public class slidingwindow {
  static  int sliding(int [] arr ,int target){
        int max =0;
        int current=0;
        int n=arr.length;
        for (int i=0;i<target;i++){
            current+=arr[i];
        }
        max=current;
        for (int i=1;i<=n-target;i++){
            current=current-arr[i-1]+arr[i+target-1];

            if (current>max){
                max=current;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int [] arr={3,8,2,5,7,6,12};
        System.out.println ( sliding (arr,4));
    }
}
