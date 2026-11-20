import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];

        // Ask the user to enter 5 scores, each from 0 to 100. Reject invalid scores and ask again.
        for (int i = 0; i < scores.length; i++) {
            while (true) {
                System.out.print("Enter score " + (i + 1) + " (0-100): ");
                if (scanner.hasNextInt()) {
                    int score = scanner.nextInt();
                    if (score >= 0 && score <= 100) {
                        scores[i] = score;
                        break;
                    } else {
                        System.out.println("Invalid score! Must be between 0 and 100.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter an integer.");
                    scanner.next();
                }
            }
        }

        // Count passed (>= 60) and failed (< 60) scores, calculate sum
        int passed = 0;
        int failed = 0;
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if (scores[i] >= 60) {
                passed++;
            } else {
                failed++;
            }
        }

        double average = (double) sum / scores.length;

        // Print all scores and results
        System.out.print("Scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
