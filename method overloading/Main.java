
class Parent {

    void add(int i, int j) {
        System.out.println("Parent: Adding two integers: " + (i + j));
    }
}

class Child extends Parent {

    @Override
    void add(int i, int j) { // Overriding the parent class method
        System.out.println("Child: Adding two integers: " + (i + j));
    }
}

public class Main {

    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.add(10, 20); // Calls Parent's add method

        Child obj2 = new Child();
        obj2.add(10, 20); // Calls Child's add method
    }
}
