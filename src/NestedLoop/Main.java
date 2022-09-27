package NestedLoop;

import java.util.Scanner;

public class Main {
    // nested loop = a loop inside of a loop
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";
        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++){
                System.out.print(symbol + " ");

            }
            System.out.println();
        }

    }
}
