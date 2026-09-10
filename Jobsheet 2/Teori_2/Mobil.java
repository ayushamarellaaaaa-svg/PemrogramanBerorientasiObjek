package Teori_2;

public class Mobil {
    public String merk;
    public String model;
    public String warna;
    public int kapasitasBBM;

    public void displayInfo() {
        System.out.println("Merk : " + merk);
        System.out.println("Model : " + model);
        System.out.println("Warna : " + warna);
        System.out.println("Kapasitas BBM : " + kapasitasBBM + " liter");
    }

    public void nyalakanMesin() {
        System.out.println("Mobil " + merk + " " + model + " dinyalakan");
    }

    public void matikanMesin() {
        System.out.println("Mobil " + merk + " " + model + " dimatikan");
    }

    public void injakGas() {
        System.out.println("Mobil " + merk + " " + model + " gas sedang diinjak");
    }

    public Mobil() {
        merk = "Toyota";
        model = "Avanza";
        warna = "Hitam";
        kapasitasBBM = 45;
    }

    public Mobil(String merk, String model, String warna, int kapasitasBBM) {
        this.merk = merk;
        this.model = model;
        this.warna = warna;
        this.kapasitasBBM = kapasitasBBM;
    }
}
