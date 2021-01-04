public class NumberToWords {

    public static void numberToWords(int number) {

        int tempNumber = reverse(number);

        if (tempNumber < 0) {
            System.out.println("Invalid Value");
        }


        for (int i = 0; i < getDigitCount(number); i++) {

            int lastDigit = tempNumber % 10; // Extracting the last digit of int number.

                if (lastDigit == 0) {
                    System.out.println("Zero");
                } else if (lastDigit == 1) {
                    System.out.println("One");
                } else if (lastDigit == 2) {
                    System.out.println("Two");
                } else if (lastDigit == 3) {
                    System.out.println("Three");
                } else if (lastDigit == 4) {
                    System.out.println("Four");
                } else if (lastDigit == 5) {
                    System.out.println("Five");
                } else if (lastDigit == 6) {
                    System.out.println("Six");
                } else if (lastDigit == 7) {
                    System.out.println("Seven");
                } else if (lastDigit == 8) {
                    System.out.println("Eight");
                } else if (lastDigit == 9) {
                    System.out.println("Nine");
                }

                tempNumber /= 10;
            }
    }

    public static int reverse(int reversedNumber) {

        int tempNumber = 0;
        int lastDigit;

        while (reversedNumber != 0) {

            lastDigit = reversedNumber % 10;
            tempNumber *= 10;
            tempNumber += lastDigit;
            reversedNumber /= 10;

        }

        return tempNumber;

    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int count = 0;

        if (number == 0) {
            return 1;
        }

        while (number > 0) {
            number /= 10;
            count++;
        }

        return count;

    }

}
