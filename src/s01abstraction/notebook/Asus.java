package s01abstraction.notebook;

public abstract class Asus extends Notebook {

    public Asus() {
        super("Asus");
    }

    @Override
    public void displayLogo() {
        System.out.println("LOGO ASUS");
    }

    public abstract void connectToWiFi();
}
