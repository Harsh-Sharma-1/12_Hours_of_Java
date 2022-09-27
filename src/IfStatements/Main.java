package IfStatements;

public class Main {
    // if statement = performs a block of code if it's condition evaluates to be true
    public static void main(String[] args) {
        int age = 5;

        if (age >= 18) {
            System.out.println("you are an adult");
        }
        else if (age >= 13) {
            System.out.println("You are a teenager");
        }
        else {
            System.out.println("you are a kid");
        }
    }
}
