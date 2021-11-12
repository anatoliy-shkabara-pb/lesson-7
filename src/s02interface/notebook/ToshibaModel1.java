package s02interface.notebook;

public class ToshibaModel1 extends Toshiba implements Phone, Tablet {

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

    @Override
    public void makeCall(String number) {
        if (batteryLevel <= 10) {
            System.out.println("Low battery level, need charging.");
            return;
        }
        System.out.println("Toshiba Model 1 make call on number " + number);
        batteryLevel -= 10;
    }

    @Override
    public void sendSms(String text) {
        if (batteryLevel <= 5) {
            System.out.println("Low battery level, need charging.");
            return;
        }
        System.out.println("Toshiba Model 1 send sms: " + text);
        batteryLevel -= 5;
    }

    @Override
    public void navigateByScreen() {
        if (batteryLevel <= 10) {
            System.out.println("Low battery level, need charging.");
            return;
        }
        System.out.println("Navigation by screen Toshiba Model 1");
        batteryLevel -= 10;
    }
}
