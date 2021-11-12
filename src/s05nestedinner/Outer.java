package s05nestedinner;

public class Outer {
    class Inner {
        public void show() {
            System.out.println("метод внутреннего класса");
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = new Outer().new Inner();
        //inner = outer.new Inner();
        inner.show();
    }
}
