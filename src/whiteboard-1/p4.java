public class p4 {
    public static void main(String[] args) {
        int[] list1 = {4, 5, 2, 3, 1, 6};
        int[] list2 = {8, 7, 6, 9, 4, 5};

        System.out.print("Intersection: ");
        findIntersection(list1, list2);
    }

    // Method to find and print the intersection of two lists
    public static void findIntersection(int[] list1, int[] list2) {
        for (int num1 : list1) {
            for (int num2 : list2) {
                if (num1 == num2) {
                    System.out.print(num1 + " ");
                }
            }
        }
    }
}
