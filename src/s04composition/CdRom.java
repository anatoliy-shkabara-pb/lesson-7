package s04composition;

public class CdRom {
    private String name;
    private double speed;
    private boolean cdWritable;

    public CdRom() {
        System.out.println("Constructor CdRom");
    }

    public void readCd(){
        System.out.println("CD reading... ");
    }

    public void openCd() {
        System.out.println("CD opened");
    }

    public void closeCd() {
        System.out.println("CD close");
    }

}
