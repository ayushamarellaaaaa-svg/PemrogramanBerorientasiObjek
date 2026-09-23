public class AntrianDemo {
    public static void main(String[] args) {
        AntrianLayanan antrian1 = new AntrianLayanan(1, "Ayusha Marella", "Legalisir Ijazah");
        AntrianLayanan antrian2 = new AntrianLayanan(2, "Yulia Anisa", "Surat Keterangan Aktif Kuliah");
        AntrianLayanan antrian3 = new AntrianLayanan(3, "Najwa Viola", "Cuti AKademik");
        AntrianLayanan antrian4 = new AntrianLayanan(4, "Pinkan Nanda", "Surat Delegasi");

        antrian1.cetakInformasi();
        antrian2.cetakInformasi();
        antrian3.cetakInformasi();
        antrian4.cetakInformasi();
        System.out.println();

        antrian1.layani();
        antrian1.selesai();
        antrian1.cetakInformasi();
        System.out.println();

        antrian2.layani();
        antrian2.batalkan();
        antrian2.cetakInformasi();
        System.out.println();

        antrian3.batalkan();
        antrian3.layani();
        antrian3.cetakInformasi();
        System.out.println();

        antrian4.selesai();
        antrian4.layani();
        antrian4.cetakInformasi();
        System.out.println();
    }
}
