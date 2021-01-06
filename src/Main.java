public class Main {

    public static void main(String[] args) {

        String numberAsString = "2018.125";
        System.out.println("numberAsString = " + numberAsString);

        /* Parsing Method
        * A parsing method is used to convert data types
        * */

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1; // Adding 1 to String numberAsString will append the number to the end of the String
                            // because the 1 is an int, which is being added to the String (incompatible data types)
                            // Therefore, "20181" will output in the console.
        number += 1; // Adding a 1 to int number will result in the output 2019 because both data types are the same (int)
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        System.out.println();

        System.out.println(FlourPacker.canPack(1,0,4));
        System.out.println(FlourPacker.canPack(1,0,5));
        System.out.println(FlourPacker.canPack(0,5,4));
        System.out.println(FlourPacker.canPack(2,2,11));
        System.out.println(FlourPacker.canPack(-3,2,12));
    }

}
