public class handphoneDemo {
    public static void main(String[] args) {
        handphone hp1 = new handphone();
        hp1.merk = "Samsung";
        hp1.tipe = "Galaxy S21";
        hp1.kapasitasBaterai = 15000;
        hp1.kapasitasPenyimpanan = 128;
        
        handphone hp2 = new handphone();
        hp2.merk = "Apple";
        hp2.tipe = "iPhone 13";
        hp2.kapasitasBaterai = 20000;
        hp2.kapasitasPenyimpanan = 256;

        handphone hp3 = new handphone();
        hp3.merk = "Xiaomi";
        hp3.tipe = "Redmi Note 10";
        hp3.kapasitasBaterai = 30000;
        hp3.kapasitasPenyimpanan = 64;

        hp1.hidupkan();
        hp1.kirimPesan("Halo, ini pesan dari Samsung Galaxy S21!");
        hp1.matikan();

        hp2.hidupkan();
        hp2.kirimPesan("Halo, ini pesan dari iPhone 13!");
        hp2.matikan();

        hp3.hidupkan();
        hp3.kirimPesan("Halo, ini pesan dari Redmi Note 10!");
        hp3.matikan();
    }
}
