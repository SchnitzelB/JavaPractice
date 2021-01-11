import java.util.Scanner;

/*

*/
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0; int max = 0;

        while (true) {

            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {

               int number = scanner.nextInt();

                if (number > max) {
                    max = number;
                } else if (number < min) {
                    min = number;
                }

            } else {
                break;
            }
            scanner.nextLine();
            }

        System.out.println("Max number = " + max + ", Min number = " + min);


        scanner.close();

    }


}





