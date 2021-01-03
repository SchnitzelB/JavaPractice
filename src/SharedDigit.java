public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if ((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)) {
            return false;
        }

        int secondFN = firstNumber % 10;
        int firstFN = (firstNumber /= 10)  % 10;

        int secondSN = secondNumber % 10;
        int firstSN = (secondNumber /= 10)  % 10;


        return ((firstFN == firstSN) || (firstFN == secondSN) || (secondFN == firstSN) || (secondFN == secondSN));

    }

}
