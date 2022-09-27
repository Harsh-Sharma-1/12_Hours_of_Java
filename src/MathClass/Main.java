package MathClass;

public class Main {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        // find max and min of two numbers
        double maxZ = Math.max(x,y);
        System.out.println(maxZ);
        double minZ = Math.min(x,y);
        System.out.println(minZ);

        // find absolute value
        double absY = Math.abs(y);
        System.out.println(absY);

        // find sqare root
        y = 10;
        double sqrtY = Math.sqrt(y);
        System.out.println(sqrtY);

        // find round
        double roundX = Math.round(x);
        System.out.println(roundX);

        // find ceil
        double ceilX = Math.ceil(x);
        System.out.println(ceilX);

        // find floor
        double floorX = Math.floor(x);
        System.out.println(floorX);

    }

}
