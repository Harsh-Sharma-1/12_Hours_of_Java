package WhileLoop;

import java.util.Scanner;

public class Main {
    // while loop = executes a block of code as long as it's condition remains true

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        // --- while loop ---
        while(name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);
    }
}
