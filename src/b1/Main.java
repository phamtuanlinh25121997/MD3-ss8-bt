package b1;

public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        System.out.println("Giá trị ban đầu của myString: " + myObject.getMyString());
        myObject.setMyString("Hello, World!");
        System.out.println("Giá trị sau khi thay đổi của myString: " + myObject.getMyString());
    }
}
