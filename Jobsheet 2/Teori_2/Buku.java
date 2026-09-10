package Teori_2;

public class Buku {
    public String judul;
    public String penulis;
    public int tahunTerbit;
    public String kategori;
    public boolean sedangDipinjam;

    public void tampilkanInfo() {
        System.out.println("Judul           : " + judul);
        System.out.println("Penulis         : " + penulis);
        System.out.println("Tahun Terbit    : " + tahunTerbit);
        System.out.println("Kategori        : " + kategori);
        System.out.println("Sedang Dipinjam : " + (sedangDipinjam ? "Ya" : "Tidak"));
    }

    public void pinjamBuku() {
        if (!sedangDipinjam) {
            sedangDipinjam = true;
            System.out.println("Buku " + judul + " berhasil dipinjam");
        } else {
            System.out.println("Buku " + judul + " sedang dipinjam");
        }
    }

    public void kembalikanBuku() {
        sedangDipinjam = false;
        System.out.println("Buku " + judul + " berhasil dikembalikan");
    }
}
