public class mobilPBO {
    public String merek;
    public String warna;
    public double hargaSewa;

    public mobilPBO(String merek, String warna, double hargaSewa) {
        this.merek = merek;
        this.warna = warna;
        this.hargaSewa = hargaSewa;
    }

    public double hitungTotalBiayaSewa(int lamaSewa) {
        return hargaSewa * lamaSewa;
    }

    public void tampilkanInformasi(int lamaSewa) {
        System.out.println("Merek            : " + merek);
        System.out.println("Warna            : " + warna);
        System.out.println("Harga Sewa       : " + hargaSewa);
        System.out.println("Total Biaya Sewa : " + hitungTotalBiayaSewa(lamaSewa));
        System.out.println("-------------------------------------");
    }

    public static void main(String[] args) {
        int lamaSewa = 3;

        mobilPBO[] daftarMobil = {
            new mobilPBO("Honda CRV", "SIlver", 550000),
            new mobilPBO("Honda Brio", "Putih", 300000),
            new mobilPBO("Toyota Innova", "Hitam", 650000),
            new mobilPBO("Daihatsu Xenia", "Maroon", 350000),
            new mobilPBO("Mitsubishi Xpander", "Teracota", 700000),
            new mobilPBO("Honda HRV", "Silver", 450000),
            new mobilPBO("Toyota Fortuner", "Hitam", 750000),
            new mobilPBO("Daihatsu Ayla", "Putih", 150000),
            new mobilPBO("Toyota Avanza", "Silver", 200000),
            new mobilPBO("Honda Mobilio", "Hitam", 300000)
        };

        for (int i = 0; i < daftarMobil.length; i++) {
            daftarMobil[i].tampilkanInformasi(lamaSewa);
        }
    }
}
