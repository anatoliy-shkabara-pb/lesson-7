package s04composition;

public class Computer {
    private String name;
    private CdRom cdRom;
    private Hdd hdd;
    private Ram ram;

    public Computer(String name, Hdd hdd, Ram ram) {
        this.name = name;
        this.hdd = hdd;
        this.ram = ram;
    }

    public void readCd() {
        if(cdRom == null) {
            cdRom = new CdRom();
        }
        cdRom.readCd();
    }
}
