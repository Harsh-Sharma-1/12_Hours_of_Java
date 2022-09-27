package UserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ------ String input ------
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        // ------ Integer Input -------
        System.out.println("What is your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // to clear the scanner
        System.out.println("you are " + age + " years old");
    }
}
