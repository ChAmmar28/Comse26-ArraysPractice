public class Task1 {
    public static void main(String[] args) {
        int[] numbers = { 5, -3, 0, 8, -1, 0, 12, -7, 4, 2 };

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Positive: " + positiveCount);
        System.out.println("Negative: " + negativeCount);
        System.out.println("Zero: " + zeroCount);
    }
}
