public class Task4 {
    public static void main(String[] args) {
        // Create an integer array containing 7 numbers
        int[] numbers = { 3, 8, 12, 5, 9, 2, 7 };

        // Print original elements
        System.out.print("Original: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Print elements in reverse order without modifying the array
        System.out.print("Reversed: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
