package s06staticnested;

public class Outer {
    static class Inner {
        public void show() {
            System.out.println("inner method show");
        }
        static void method1() {
            System.out.println("inner static method");
        }
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.show();
        Inner.method1();
    }
}
