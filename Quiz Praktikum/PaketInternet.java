public class PaketInternet {
    private String kodePaket;
    private double kuota;
    private double harga;
    private boolean aktif;

    public PaketInternet(String kodePaket, double kuotaAwal, double Harga) {
        if (kuotaAwal <= 0) {
            System.out.println("Kuota awal harus lebih dari 0");
        }
        if (harga < 0) {
            System.out.println("Harga tidak boleh negatif");
        }

        this.kodePaket = kodePaket;
        this.kuota = kuotaAwal;
        this.harga = 0;
        this.aktif = false;
    }

    public String getKodePaket() {
        return kodePaket;
    }

    public double getHarga() {
        return harga;
    }

    public double getSisaKuota() {
        return kuota;
    }

    public String getStatusPaket() {
        return aktif ? "Aktif" : "Nonaktif";
    }

    public void aktifkan() {
        aktif = true;
        System.out.println("Paket " + kodePaket + " berhasil diaktifkan");
    }

    public void nonaktifkan() {
        aktif = false;
        System.out.println("Paket " + kodePaket + "dinonaktifkan");
    }

    public boolean gunakanKuota(double jumlah) {
        if(jumlah <= 0) {
            System.out.println("Penolakan paket " + kodePaket + ": Jumlah pengguna harus bernilai positif");
            return false;
        }
        if(!aktif) {
            System.out.println("Penolakan paket " + kodePaket + ": Paket sedang nonaktif, pengguna tidak diizinkan");
            return false;
        }
        if(jumlah > kuota) {
            System.out.println("Penolakan paket " + kodePaket + ": Kuota tersisa " + kuota + " MB. tidak cukup untuk penggunaan " + jumlah + " MB");
            return false;
        }
        kuota -= jumlah;
        System.out.println("Penggunaan paket " + jumlah + " MB pada paket " + kodePaket + " berhasil. Sisa kuota anda " + kuota + " MB");
        return true;
    }

    public void cetakInformasi() {
        System.out.println("=== Paket Interet Mahasiswa ===");
        System.out.println("Kode Paket : " + kodePaket);
        System.out.println("Harga      : " + harga);
        System.out.println("Status     : " + getStatusPaket());
        System.out.println("Sisa Kuota : " + kuota + " MB");
        System.out.println("==============================");
    }
}
