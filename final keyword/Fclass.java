// final class 

final class FinalClass {

    public void showMessage() {
        System.out.println("This is a final class.");
    }
}

// Uncommenting the below line will cause an error
//class SubClass extends FinalClass {
//}
public class Fclass {

    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.showMessage();
    }
}
