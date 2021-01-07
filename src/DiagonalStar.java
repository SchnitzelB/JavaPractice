public class DiagonalStar {

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int rowCount = 1; rowCount <= number; rowCount++) {
            for (int columnCount = 1; columnCount <= number; columnCount++) {

                if ((rowCount == columnCount) || (rowCount == 1 || columnCount == 1) ||  (rowCount == number || columnCount == number) ||
                        (columnCount == number - rowCount + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
