package s01abstraction.notebook;

public class ToshibaModel1 extends Toshiba {

    @Override
    public void doWork() {
        if (batteryLevel <= 30) {
            System.out.println("Low battery level, need charging.");
            return;
        }

        System.out.println("Toshiba Model 1 working...");
        batteryLevel -= 30;
        System.out.println("Toshiba Model 1 work done.");
    }

}
