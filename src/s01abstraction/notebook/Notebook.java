package s01abstraction.notebook;

public abstract class Notebook {

    private static final int MAX_BATTERY_LEVEL = 100;

    private String model;

    protected int batteryLevel;

    public Notebook(String model) {
        this.model = model;
        this.batteryLevel = MAX_BATTERY_LEVEL / 2;
    }

    public void charge() {
        System.out.println("Notebook " + model + " is charging...");
        batteryLevel = MAX_BATTERY_LEVEL;
        System.out.println("Notebook " + model + " charged.");
    }

    public abstract void doWork();

    public abstract void displayLogo();
}
