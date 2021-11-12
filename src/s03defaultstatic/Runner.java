package s03defaultstatic;

public class Runner implements Human, Walkable {
    @Override
    public void walk() {
        System.out.println("Я бегу");
    }
}
