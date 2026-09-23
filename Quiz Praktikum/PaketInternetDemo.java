public class PaketInternetDemo {
    public static void main(String[] args) {
        PaketInternet paket1 = new PaketInternet("Hemat", 1000, 25000);
        PaketInternet paket2 = new PaketInternet("Hot Promo", 2000, 45000);
        PaketInternet paket3 = new PaketInternet("Mingguan", 5000, 80000);

        paket1.aktifkan();
        paket1.gunakanKuota(200);
        paket1.nonaktifkan();
        paket1.gunakanKuota(100);
        paket1.cetakInformasi();
        System.out.println();

        paket2.gunakanKuota(100);
        paket2.cetakInformasi();
        System.out.println();

        paket3.gunakanKuota(6000);
        paket3.gunakanKuota(-50);
        paket3.cetakInformasi();
        System.out.println();

    }
}
