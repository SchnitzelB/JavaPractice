public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) { // Step 1
            if (year % 100 == 0) { // Step 2
                if (year % 400 == 0) { // Step 3
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }

    }

    public static int getDaysInMonth(int month, int year) {

        int days = 0;
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            days = -1;
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 2:
                    if (isLeapYear(year) == false) {
                        days = 28;
                    } else if (isLeapYear(year) == true) {
                        days = 29;
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
            }
        }

        return days;

    }

}