package RandomClass;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // random integer
        int x = random.nextInt();
        System.out.println(x);

        // with limit
        x = random.nextInt(6) + 1;
        System.out.println(x);

        // random double value
        double y = random.nextDouble();
        System.out.println(y);

        // random boolean value
        boolean z = random.nextBoolean();
        System.out.println(z);




    }
}
