public class p7 {
    public static void main(String[] args) {
        int number = 16; // You can change this value to test with other numbers
        System.out.println("Square root of " + number + " is: " + squareRoot(number));
    }

    // Method to calculate the square root without using built-in functions
    public static int squareRoot(int n) {
        int low = 0;
        int high = n;
        int result = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                low = mid + 1;
                result = mid;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}
