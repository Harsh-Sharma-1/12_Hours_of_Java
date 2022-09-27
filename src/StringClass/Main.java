package StringClass;

public class Main {
    // String = a reference data type that can store one or more characters
    //          reference data types have access to useful methods

    public static void main(String[] args) {
        String name = "Alex";

        // compare two strings
        System.out.println(name.equals("Alex"));

        // compare two strings and ignore case
        System.out.println(name.equalsIgnoreCase("alex"));

        // find length of string
        System.out.println(name.length());

        // find char at certain index
        System.out.println(name.charAt(1));

        // find index of a certain char in a string
        System.out.println(name.indexOf("l"));

        // check if a string is empty
        System.out.println(name.isEmpty());

        // change string letters to uppercase
        System.out.println(name.toUpperCase());

        // change string letters to lowercase
        System.out.println(name.toLowerCase());

        // remove empty space from before and after of string
        System.out.println(name.trim());

        // replace a char in a string
        System.out.println(name.replace('x','n'));
    }
}
