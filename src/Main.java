import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String numberAsString = "2018.125";
        System.out.println("numberAsString = " + numberAsString);

        /* Parsing Method
        * A parsing method is used to convert data types
        * */

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1; // Adding 1 to String numberAsString will append the number to the end of the String
                            // because the 1 is an int, which is being added to the String (incompatible data types)
                            // Therefore, "20181" will output in the console.
        number += 1; // Adding a 1 to int number will result in the output 2019 because both data types are the same (int)
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

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
