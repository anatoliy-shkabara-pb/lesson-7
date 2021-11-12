package s07methodinner;

public class Outer {
    public void outerMethod() {
        System.out.println("Outer method");
        int i = 42;
        class Inner {
            public void show() {
                System.out.println("inner method, i = " + i);
            }
        }
        Inner inner = new Inner();
        inner.show();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();
    }
}
