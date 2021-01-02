public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int reverseInt = 0;
        int lastDigit = 0;
        int temp = number;

        while(number != 0) {
            lastDigit = number % 10; // Storing the last digit to of int number to int lastDigit.
            reverseInt = reverseInt * 10; // Increasing the place value of reverseInt by One.
            reverseInt += lastDigit; // Adding lastDigit to reverseInt.
            number /= 10; // Removing the last digit from int number.
        }

        System.out.println(number);
        return temp == reverseInt;
    }

}
