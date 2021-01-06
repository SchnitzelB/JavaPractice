public class FactorPrinter {

    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
        }

        int numberFactor = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                numberFactor = i;
                System.out.println(numberFactor);
            }

        }

    }

}
