public class Main {

    public static void main(String[] args) {

//        int count = 6;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println();

//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if (count > 100) {
//                break;
//            }
//
//        } while (count != 6);
//

        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                count++;
                continue;
            }
            System.out.println("Even number " + number);

            if (count == 5) {
                System.out.println("There are " + count + " even numbers in this loop");
                break;
            }
        }

        System.out.println();

        System.out.println(DigitSumChallenge.sumDigits(125));
        System.out.println(DigitSumChallenge.sumDigits(-125));
        System.out.println(DigitSumChallenge.sumDigits(4));
        System.out.println(DigitSumChallenge.sumDigits(32123));

        System.out.println();

        System.out.println(NumberPalindrome.isPalindrome(-1221));
        System.out.println(NumberPalindrome.isPalindrome(707));
        System.out.println(NumberPalindrome.isPalindrome(11212));

    }

    public static boolean isEvenNumber(int evenNumber) {

        if (evenNumber % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
