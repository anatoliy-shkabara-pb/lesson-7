package s08anoninner;

public class Outer {
    static Demo demo = new Demo() {
        @Override
        public void show() {
            super.show();
            System.out.println("Annonymus show");
        }
    };

    public static void main(String[] args) {
        demo.show();

        Hello hello = new Hello() {
            @Override
            public void sayHello() {
                System.out.println("hi");
            }
        };

        hello.sayHello();
    }
}
