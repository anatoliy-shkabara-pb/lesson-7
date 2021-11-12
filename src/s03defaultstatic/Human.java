package s03defaultstatic;

public interface Human {
    default void walk() {
        System.out.println("Ну я пошел...");
    }

    static void sayHello() {
        System.out.println("Hi");
    }
}
