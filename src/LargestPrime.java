public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number <= 0) {
            return -1;
        }

        int remainderInt = 0;
        int largestPrimeNumber = 0;

        for (int i = 3; i < number; i++) {

            if (number % i == 0) {
                remainderInt = i;
                if (remainderInt % i == 0) {
                    largestPrimeNumber = remainderInt;

                }
            }

        }

        return largestPrimeNumber;

    }
}
