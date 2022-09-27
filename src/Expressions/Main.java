package Expressions;

public class Main {
    // expression = operands & operators
    // operands = values, variables, numbers, quantity
    // operators = + - * / %
    public static void main(String[] args) {
        int friends = 10;
        friends = friends + 1;
        System.out.println(friends);
        friends = friends - 1;
        System.out.println(friends);
        friends = friends * 2;
        System.out.println(friends);
        friends = friends / 2;
        System.out.println(friends);
        friends = friends % 2;
        System.out.println(friends);

        // ------ shorthand ways ------
        friends++;
        System.out.println(friends);
        friends--;
        System.out.println(friends);


    }
}
