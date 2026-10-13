public class Kendaraan {
    private String platNomor;
    private String jenisKendaraan;
    private String merek;
    private boolean sedangParkir;   
    private int jamMasuk;
    private int jamKeluar;
    private int biayaParkir;
    private String pesan;
    
    public Kendaraan(String platNomor, String jenisKendaraan, String merek) {
        this.platNomor = platNomor;
        this.jenisKendaraan = jenisKendaraan;
        this.merek = merek;
        this.sedangParkir = false;
        this.jamMasuk = 0;
        this.jamKeluar = 0;
        this.biayaParkir = 0;
        this.pesan = "";
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public String getMerek() {
        return merek;
    }

    public boolean isSedangParkir() {
        return sedangParkir;
    }

    public int getJamMasuk() {
        return jamMasuk;
    }

    public int getJamKeluar() {
        return jamKeluar;
    }

    public int getBiayaParkir() {
        return biayaParkir;
    }

    public String getPesan() {
        return pesan;
    }

    public String getStatusParkir() {
        if (sedangParkir) {
            return "sedang parkir";
        } else {
            return "tidak parkir";
        }
    }

    private boolean jamValid(int jam) {
        return jam >= 0 && jam <= 23;
    }

    private int hitungBiayaParkir(int durasi) {
        if (durasi <= 2) {
            return 3000;
        } else {
            return 3000 + (durasi - 2) * 2000;
        }
    }

    public void masukParkir(int jamMasuk) {
        biayaParkir = 0;
        if (!jamValid(jamMasuk)) {
            pesan = "Jam masuk harus di antara 0 - 23";
            return;
        }
        if (sedangParkir) {
            pesan = "Kendaraan sedang parkir, tidak bisa masuk lagi";
            return;
        }
        this.jamMasuk = jamMasuk;
        sedangParkir = true;
        pesan = "Kendaraan berhasil masuk pada jam " + jamMasuk;
    }

    public void keluarParkir(int jamKeluar) {
        biayaParkir = 0;
        if (!jamValid(jamKeluar)) {
            pesan = "Jam keluar harus di antara 0 - 23";
            return;
        }
        if (!sedangParkir) {
            pesan = "Kendaraan belum parkir, tidak bisa keluar";
            return;
        }
        if (jamKeluar < jamMasuk) {
            pesan = "Jam keluar: " + jamKeluar + " lebih awal dari jam masuk: " + jamMasuk;
            return;
        }
        int durasi = jamKeluar - jamMasuk;
        this.jamKeluar = jamKeluar;
        biayaParkir = hitungBiayaParkir(durasi);
        sedangParkir = false;
        pesan = "kendaraan berhasil keluar pada jam " + jamKeluar;
    }

    public String getInfo() {
        String info = "";
        info += "Kendaraan     : " + platNomor + "\n";
        info += "Jenis         : " + jenisKendaraan + "\n";
        info += "Merek         : " + merek + "\n";
        info += "Status Parkir : " + getStatusParkir() + "\n";
        info += "Jam Masuk     : " + jamMasuk + "\n";
        info += "Jam Keluar    : " + jamKeluar + "\n";
        info += "Biaya Parkir  : " + biayaParkir + "\n";
        info += "Pesan         : " + pesan + "\n";

        return info;
    }
}
