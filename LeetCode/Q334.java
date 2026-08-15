package LeetCode;

public class Q334 {

    // Yeh aapka main algorithm wala function hai
    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }
        return false;
    }

    // Main method jahan se Java program start hota hai
    public static void main(String[] args) {

        // Aapka diya hua test case
        int[] data = {2, 1, 5, 0, 4, 6};

        // Function ko call kar rahe hain aur result store kar rahe hain
        boolean result = increasingTriplet(data);

        // Result print kar rahe hain
        System.out.println("Array 1 Result: " + result);

        // Kuch aur test cases aapki practice ke liye:

        int[] data2 = {5, 4, 3, 2, 1};
        System.out.println("Array 2 Result: " + increasingTriplet(data2));
        // Iska output 'false' aana chahiye

        int[] data3 = {1, 2, 3, 4, 5};
        System.out.println("Array 3 Result: " + increasingTriplet(data3));
        // Iska output 'true' aana chahiye
    }
}