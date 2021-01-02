public class DigitSumChallenge {

    public static int sumDigits(int number) {

        int sum = 0;

        if (number < 10) {
            return -1;
        }

        while (number != 0) {
            int digit = number % 10; // This step extracts the least significant digit.
            sum += digit;

            // Drop the least-significant digit
            number /= 10; // Same as number = number / 10;
        }

        return sum;

    }

}
