public class mobilStruktural {
    public static void main(String[] args) {
        String merek1, merek2, merek3, merek4, merek5, merek6, merek7, merek8, merek9, merek10;
        String warna1, warna2, warna3, warna4, warna5, warna6, warna7, warna8, warna9, warna10;
        double hargaSewa1, hargaSewa2, hargaSewa3, hargaSewa4, hargaSewa5, hargaSewa6, hargaSewa7, hargaSewa8, hargaSewa9, hargaSewa10;
        double totalBiaya1, totalBiaya2, totalBiaya3, totalBiaya4, totalBiaya5, totalBiaya6, totalBiaya7, totalBiaya8, totalBiaya9, totalBiaya10;

        int lamaSewa = 3;

        merek1 = "Honda CRV";
        warna1 = "Silver";
        hargaSewa1 = 550000;

        merek2 = "Honda Brio";
        warna2 = "Putih";
        hargaSewa2 = 300000;

        merek3 = "Toyota Innova";
        warna3 = "Hitam";
        hargaSewa3 = 650000;

        merek4 = "Daihatsu Xenia";
        warna4 = "Maroon";
        hargaSewa4 = 350000;

        merek5 = "Mitsubishi Xpander";
        warna5 = "Teracota";
        hargaSewa5 = 700000;

        merek6 = "Honda HRV";
        warna6 = "Silver";
        hargaSewa6 = 450000;

        merek7 = "Toyota Fortuner";
        warna7 = "Hitam";
        hargaSewa7 = 750000;

        merek8 = "Daihatsu Ayla";
        warna8 = "Putih";
        hargaSewa8 = 150000;

        merek9 = "Toyota Avanza";
        warna9 = "Silver";
        hargaSewa9 = 200000;

        merek10 = "Honda Mobilio";
        warna10 = "Hitam";
        hargaSewa10 = 300000;

        totalBiaya1 = hitungTotalBiayaSewa(hargaSewa1, lamaSewa);
        totalBiaya2 = hitungTotalBiayaSewa(hargaSewa2, lamaSewa);
        totalBiaya3 = hitungTotalBiayaSewa(hargaSewa3, lamaSewa);
        totalBiaya4 = hitungTotalBiayaSewa(hargaSewa4, lamaSewa);
        totalBiaya5 = hitungTotalBiayaSewa(hargaSewa5, lamaSewa);
        totalBiaya6 = hitungTotalBiayaSewa(hargaSewa6, lamaSewa);
        totalBiaya7 = hitungTotalBiayaSewa(hargaSewa7, lamaSewa);
        totalBiaya8 = hitungTotalBiayaSewa(hargaSewa8, lamaSewa);
        totalBiaya9 = hitungTotalBiayaSewa(hargaSewa9, lamaSewa);
        totalBiaya10 = hitungTotalBiayaSewa(hargaSewa10, lamaSewa);

        tampilkanInformasi(merek1, warna1, hargaSewa1, totalBiaya1);
        tampilkanInformasi(merek2, warna2, hargaSewa2, totalBiaya2);
        tampilkanInformasi(merek3, warna3, hargaSewa3, totalBiaya3);
        tampilkanInformasi(merek4, warna4, hargaSewa4, totalBiaya4);
        tampilkanInformasi(merek5, warna5, hargaSewa5, totalBiaya5);
        tampilkanInformasi(merek6, warna6, hargaSewa6, totalBiaya6);
        tampilkanInformasi(merek7, warna7, hargaSewa7, totalBiaya7);
        tampilkanInformasi(merek8, warna8, hargaSewa8, totalBiaya8);
        tampilkanInformasi(merek9, warna9, hargaSewa9, totalBiaya9);
        tampilkanInformasi(merek10, warna10, hargaSewa10, totalBiaya10);

    }

    public static void tampilkanInformasi(String merek, String warna, double hargaSewa, double totalBiaya) {
        System.out.println("Merek            : " + merek);
        System.out.println("Warna            : " + warna);
        System.out.println("Harga Sewa       : " + hargaSewa);
        System.out.println("Total Biaya Sewa : " + totalBiaya);
        System.out.println("-------------------------------------");
    }

    public static double hitungTotalBiayaSewa(double hargaSewa, int jumlahHari) {
        double totalBiaya;
        totalBiaya = hargaSewa * jumlahHari;
        return totalBiaya;
    }
}