package manusia;

public class Manusia {

    public static void main(String[] args) {

        Kakak crKakak = new Kakak();
        Adik1 Adik1 = new Adik1();
        Adik2 Adik2 = new Adik2();
        Bungsu bungsu = new Bungsu();
        

        System.out.println("Ciri - Ciri Keluarga");
        
        
        System.out.println("Ayah");
        System.out.println("Bentuk Hidung: Mancung");
        System.out.println("Sifat Dasar: Aktif");
        System.out.println("Bentuk Kepala: Bulat");
        System.out.println("");
        
        System.out.println("Ibu");
        System.out.println("Bentuk Hidung: Pesek");
        System.out.println("Sifat Dasar: Pendiam");
        System.out.println("Bentuk Kepala: Oval");
        System.out.println("");
        
        System.out.println("Kakak");
        crKakak.hidung();
        crKakak.pesek();

        crKakak.sifat();
        crKakak.pendiam();

        crKakak.bntkkpl();
        crKakak.oval();
        System.out.println(" ");

        System.out.println("Adik Pertama");
        Adik1.hidung();
        Adik1.pesek();

        Adik1.sifat();
        Adik1.pendiam();

        Adik2.bntkkpl();
        Adik1.oval();
        System.out.println(" ");

        System.out.println("Adik Kedua");
        Adik2.hidung();
        Adik2.mancung();

        Adik2.sifat();
        Adik2.aktif();

        Adik2.bntkkpl();
        Adik2.bulat();
        System.out.println(" ");

        System.out.println("Bungsu");
        bungsu.hidung();
        bungsu.sifat();
        bungsu.bntkkpl();
        System.out.println(" ");
    }

}
