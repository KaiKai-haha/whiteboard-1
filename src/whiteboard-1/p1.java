public class p1 {
    public static void main(String[] args) {
        int[] numbers = {21, 400, 8, -3, 77, 99, -16, 55, 111, -36, 28};
        sortNumbers(numbers);
        
        System.out.print("Sorted Numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    // Method to sort numbers in ascending order
    public static void sortNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap numbers[j] and numbers[j + 1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}
