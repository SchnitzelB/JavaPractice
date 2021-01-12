import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0L;
        int averageCounter = 0;

        while (true) {

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {

                int number = scanner.nextInt();
                sum += number;
                averageCounter++;
            } else {
                average = averageCounter > 0 ? Math.round((double) sum / averageCounter) : 0;

                break;
            }
            scanner.nextLine();
        }

        System.out.println("SUM = " + sum + " AVG = " + average);

        scanner.close();

    }

}