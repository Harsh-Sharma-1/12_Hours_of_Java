package Variables;

public class Main {

    // data types
    // primitive => boolean,byte,short,int,long,float,double,char
    // reference => String etc.

    // primitive vs reference
    // primitive => 8 types
    // reference => unlimited (user defined)

    // primitive => stores data
    // reference => stores an address

    // primitive => can only hold 1 value
    // reference => could hold more than 1 value

    // primitive => less memory
    // reference => more memory

    // primitive => faster
    // reference => slower

    public static void main(String[] args) {
        // -------------- Integers ---------------
        int x; // declaration
        x = 10; // assignment
        int y = 20; // initialization
        int z = x + y;
        System.out.println(z);
        System.out.println("the result is: "+x);

        // -------------- long ----------------
        long longX = 123949959203950L;
        System.out.println("long value: "+longX);

        // -------------- double & float ------------
        float floatX = 3.14f;
        System.out.println("float value: "+floatX);
        double doubleX = 3.14;
        System.out.println("double value: "+doubleX);

        // ---------------- boolean --------------
        boolean boolX = true;
        System.out.println("boolean value: "+boolX);

        // ---------------- char -----------------
        char charX = 'x';
        System.out.println("char value: "+charX);

        // ---------------- String (reference datatype) ------------
        String name = "Alex";
        System.out.println("Hello "+name);








    }
}
