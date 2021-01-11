import java.util.Scanner;

/*

*/
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int min, max;
        min = max = number;

        while (true) {

            System.out.println("Enter number: ");
            number = scanner.nextInt();
            if (number > min) {
                min = number;
            } else if (number < max) {
                max = number;
            } else if (!scanner.hasNextInt()){
                System.out.println("Max number = " + max);
                System.out.println("Min number = " + min);
                break;
            }

            scanner.nextLine();

        }


        scanner.close();

    }


}





