public class Task3 {
    public static void main(String[] args) {
        // Create an integer array containing 6 numbers
        int[] numbers = { 10, 20, 30, 40, 50, 60 };

        // Calculate the sum
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Count values strictly greater than the average
        int countAboveAverage = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                countAboveAverage++;
            }
        }

        // Print the array
        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Print results
        System.out.println("Average: " + average);
        System.out.println("Numbers above average: " + countAboveAverage);
    }
}
