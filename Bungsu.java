package manusia;

public class Bungsu extends Kakak {

    @Override
    void hidung() {
        System.out.print("Bentuk hidung: ");
        pesek();
    }

    @Override
    void sifat() {
        System.out.print("Sifat Dasar: ");
        pendiam();
    }

    @Override
    void bntkkpl() {
        System.out.print("Bentuk Kepala: ");
        oval();
    }

    protected void mancung() {
        System.out.println("mancung");
    }

    protected void aktif() {
        System.out.println("aktif");
    }

    protected void oval() {
        System.out.println("oval");
    }
}
