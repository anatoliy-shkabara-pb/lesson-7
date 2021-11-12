package s02interface;

import s02interface.notebook.*;

public class Main {
    public static void main(String[] args) {
        ToshibaModel1 toshiba = new ToshibaModel1();
        Asus asus = new AsusModel1();

        toshiba.displayLogo();
        asus.doWork();

        asus.connectToWiFi();

        doWorkWithNotebook(asus);
        doWorkWithNotebook(toshiba);

        Notebook[] notebooks = new Notebook[] {toshiba, asus};
        makeCallToEmergency(notebooks);
    }

    public static void doWorkWithNotebook(Notebook notebook) {
        notebook.doWork();
    }

    public static void makeCallToEmergency(Notebook[] notebooks) {
        for (Notebook notebook: notebooks) {
            if (notebook instanceof Phone) {
                Phone phone = (Phone) notebook;
                phone.makeCall("911");
            }
        }

    }
}
