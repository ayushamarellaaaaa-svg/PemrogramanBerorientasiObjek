import java.util.ArrayList;

public class Anggota {
    private String idAnggota;
    private String nama;
    private String jurusan;
    private ArrayList<Peminjaman> daftarPeminjaman;

    public Anggota(String idAnggota, String nama, String jurusan) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.jurusan = jurusan;
        this.daftarPeminjaman = new ArrayList<Peminjaman>();
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void tambahPeminjaman(Peminjaman p) {
        daftarPeminjaman.add(p);
    }

    public void tampilRiwayat() {
        System.out.println("ID Anggota : " + idAnggota);
        System.out.println("Nama       : " + nama);
        System.out.println("Jurusan    : " + jurusan);

        if (!daftarPeminjaman.isEmpty()) {
            System.out.println("Riwayat Peminjaman: ");

            for (Peminjaman p : daftarPeminjaman) {
                System.out.println("---------------------------------------------------------------");
                p.tampilInfo();
            }
            System.out.println("---------------------------------------------------------------");
        } else {
            System.out.println("Belum ada riwayat peminjaman");
        }
    }
}
