package homework;

public class Test {
    public static void main(String[] args) {
        A a1 = new A() {
            public void printValue() {
                System.out.println("A");
            }
        };
        a1.printValue();
    }
}
