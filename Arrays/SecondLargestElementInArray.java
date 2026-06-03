package Arrays;

public class SecondLargestElementInArray {
    static int getsecondlargestelememt(int[] arr){
        int n=arr.length;
        int firslargest=-1;
        int secondlargest=-1;
        for (int i=0;i<n;i++){
            if (arr[i]>firslargest){
                firslargest=arr[i];
            }
        }
//        System.out.println (firslargest );
        //second largest element
        for (int i=0;i<n;i++){
            if (arr[i]!=firslargest&&arr[i]>secondlargest){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }

    public static void main(String[] args) {
        int arr[]={5,2,3,8,56,89,90,7,6};
        System.out.println (getsecondlargestelememt (arr) );

    }
}
