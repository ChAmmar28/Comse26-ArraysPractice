public class Task3 {
    public static void main(String[] args) {
       
        int[] numbers = { 10, 20, 30, 40, 50, 60 };

        
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        
        double average = (double) sum / numbers.length;

        int countAboveAverage = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                countAboveAverage++;
            }
        }

        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Average: " + average);
        System.out.println("Numbers above average: " + countAboveAverage);
    }
}
