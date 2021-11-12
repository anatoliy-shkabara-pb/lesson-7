package s03defaultstatic;

public interface Walkable {
    default void walk() {
        System.out.println("ходьба");
    }
}
