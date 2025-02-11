
public class abstraction {

    public static void main(String args[]) {
        horse h = new horse();
        h.eat();
        h.walk();

    }
}

abstract class animal {

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class horse extends animal {

    void walk() {
        System.out.println("walk on 2 legs");
    }
}
