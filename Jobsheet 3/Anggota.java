public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPinjam;
    private int jumlahPinjam;

    public Anggota(String nomorKtp, String nama, int limitPinjam, int jumlahPinjam) {
        this.nomorKTP = nomorKtp;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
        this.jumlahPinjam = 0;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjam() {
        return limitPinjam;
    }

    public int getJumlahPinjam() {
        return jumlahPinjam;
    }

    public void pinjam(int nominal) {
        if(jumlahPinjam + nominal > limitPinjam) {
            System.out.println("Maaf jumlah pinjam melebihi limit");
        } else {
            jumlahPinjam += nominal;
        }
    }

    public void angsur(int nominal) {
        int minimalAngsuran = (int) (0.1 * jumlahPinjam);
        if(nominal < minimalAngsuran) {
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        } else {
            jumlahPinjam =+ nominal;
        }
    }
}
