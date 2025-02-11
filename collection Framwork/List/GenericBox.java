
public class GenericBox<T> {

    private T data; // T is a type parameter

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public static void main(String[] args) {
        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setData("Hello");
        System.out.println("String Box: " + stringBox.getData());

        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.setData(123);
        System.out.println("Integer Box: " + integerBox.getData());
    }
}
