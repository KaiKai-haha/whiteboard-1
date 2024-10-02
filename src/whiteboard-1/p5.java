public class p5 {
    public static void main(String[] args) {
        int[] list1 = {4, 5, 2, 3, 1, 6};
        int[] list2 = {8, 7, 6, 9, 4, 5};

        System.out.print("Symmetric Difference: ");
        findSymmetricDifference(list1, list2);
    }

    // Method to find and print the symmetric difference between two lists
    public static void findSymmetricDifference(int[] list1, int[] list2) {
        boolean found;

        // Print elements in list1 not in list2
        for (int num1 : list1) {
            found = false;
            for (int num2 : list2) {
                if (num1 == num2) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(num1 + " ");
            }
        }

        // Print elements in list2 not in list1
        for (int num2 : list2) {
            found = false;
            for (int num1 : list1) {
                if (num2 == num1) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(num2 + " ");
            }
        }
    }
}
