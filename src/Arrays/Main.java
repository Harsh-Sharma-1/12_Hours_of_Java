package Arrays;

public class Main {
    // array = used to store multiple values in a single variable
    public static void main(String[] args) {
        String[] cars = {"Camaro","Corvette","Tesla"};
        cars[0] = "Mustang";
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        // another way to create an array
        String[] names = new String[3];
        names[0]="Alex";
        names[1]="Sia";
        names[2]="James";

        // loop through an array
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
