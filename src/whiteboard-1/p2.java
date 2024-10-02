// src/P2.java
public class p2 {
    public static void main(String[] args) {
        fizzBuzz();
    }

    // Method to print numbers from 1 to 100 with FizzBuzz rules
    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz, ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz, ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz, ");
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}
