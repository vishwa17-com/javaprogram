
class Overloading {

    // Overloaded methods with different parameter types or combinations
    void add(int i, int j) {
        System.out.println("Adding two integers: " + (i + j));
    }

    void add(short i, short j) {
        System.out.println("Adding two shorts: " + (i + j));
    }

    void add(int i, float j) {
        System.out.println("Adding an int and a float: " + (i + j));
    }

    void add(float i, float j) {
        System.out.println("Adding two floats: " + (i + j));
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();

        obj.add(11, 17);          // Calls add(int, int)
        obj.add((short) 11, (short) 17);  // Calls add(short, short)
        obj.add(11, 11.11f);        // Calls add(int, float)
        obj.add(14.15f, 13.15f);      // Calls add(float, float)
    }
}
