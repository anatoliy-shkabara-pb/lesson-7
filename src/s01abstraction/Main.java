package s01abstraction;

import s01abstraction.notebook.Asus;
import s01abstraction.notebook.AsusModel1;
import s01abstraction.notebook.Notebook;
import s01abstraction.notebook.ToshibaModel1;

public class Main {
    public static void main(String[] args) {
        Notebook toshiba = new ToshibaModel1();
        Asus asus = new AsusModel1();

        toshiba.displayLogo();
        asus.doWork();

        asus.connectToWiFi();

        doWorkWithNotebook(asus);
        doWorkWithNotebook(toshiba);

    }

    public static void doWorkWithNotebook(Notebook notebook) {
        notebook.doWork();
    }
}
