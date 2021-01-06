public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while(number != 0) {

            int temp = number % 10;
            if (temp % 2 == 0) {
                sum = temp + sum;
            }
            number /= 10;

        }

        return sum;

    }
}
