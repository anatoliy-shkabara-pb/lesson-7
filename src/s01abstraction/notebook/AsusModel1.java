package s01abstraction.notebook;

public class AsusModel1 extends Asus {

    @Override
    public void connectToWiFi() {
        System.out.println("Asus Model 1 connected to WiFi");
    }

    @Override
    public void doWork() {
        if (batteryLevel <= 20) {
            System.out.println("Low battery level, need charging.");
            return;
        }

        System.out.println("Asus Model 1 working...");
        batteryLevel -= 20;
        System.out.println("Asus Model 1 work done.");
    }
}
