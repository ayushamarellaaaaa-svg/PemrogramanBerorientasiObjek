package Teori_2;

public class handphone {
    public String merk;
    public String tipe;
    public int kapasitasBaterai;
    public int kapasitasPenyimpanan;

    public void displayInfo() {
        System.out.println("Merk HP : " + merk);
        System.out.println("Tipe HP : " + tipe);
        System.out.println("Kapasitas Baterai : " + kapasitasBaterai + " mAh");
        System.out.println("Kapasitas Penyimpanan : " + kapasitasPenyimpanan + " GB");
    }

    public void hidupkan() {
        System.out.println(merk + " " + tipe + " dinyalakan");
    }

    public void matikan() {
        System.out.println(merk + " " + tipe + " dimatikan");
    }

    public void kirimPesan(String pesan) {
        System.out.println("Mengirim pesan: " + pesan);
    }
}
