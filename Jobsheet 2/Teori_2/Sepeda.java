package Teori_2;

public class Sepeda {
    public String merk;
    public String warna;
    public int ukuranRoda;
    public int harga;
    public int berat;

    public void displayInfo() {
        System.out.println("Merk : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Ukuran Roda : " + ukuranRoda + " inci");
        System.out.println("Harga : Rp" + harga);
        System.out.println("Berat : " + berat + " kg");
    }

    public void kayuh() {
        System.out.println("Sepeda " +merk + " " + warna + " sedang dikayuh");
    }

    public void rem() {
        System.out.println("Sepeda " + merk + " " + warna + " sedang direm");
    }

    public void belok(String arah) {
        System.out.println("Sepeda " + merk + " " + warna + " sedang belok ke " + arah);
    }
}
