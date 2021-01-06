public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int largeCount = bigCount * 5;
        if ((bigCount < 0 ) || (smallCount < 0) || (goal < 0) || (largeCount + smallCount < goal)) {
            return false;
        }

        return (smallCount >= goal % 5);

    }

}
