import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        /* Parsing Method
        * A parsing method is used to convert data types
        * */

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 1;

        while (true) {
            System.out.println("Enter number #" + i + ": ");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                i++;
                if (i == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine(); // handle end of line (enter key)

        }
        System.out.println("The sum of all input numbers is " + sum);
        scanner.close();

    }


}
