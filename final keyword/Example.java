// final Method

class Parent {

    public final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {

    // Uncommenting the below method will cause an error
    //@Override
    //public void display() {
    //System.out.println("Trying to override.");
    //}
}

public class Example {

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
