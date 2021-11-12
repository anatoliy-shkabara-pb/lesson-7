package s01abstraction.notebook;

public abstract class Toshiba extends Notebook {
    public Toshiba() {
        super("Toshiba");
    }

    @Override
    public void displayLogo() {
        System.out.println("LOGO TOSHIBA");
    }
}