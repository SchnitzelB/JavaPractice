import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int inputSum = 0;
        int i = 1;

        while (i <= 10) {
            System.out.println("Enter number #" + i + ": ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                inputSum += input;
                i++;
            } else {
                System.out.println("Invalid Number");
                break;
            }

        }
        System.out.println("The sum of all input numbers is " + inputSum);
        scanner.close();

    }

}
