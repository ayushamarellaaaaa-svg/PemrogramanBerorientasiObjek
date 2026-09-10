package Teori_2;

public class Anggota {
    public String nama;
    public String nim;
    public String jurusan;

    public void tampilkanInfo() {
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Jurusan: " + jurusan);
    }
    
    public void pinjamBuku(Buku buku) {
       buku.pinjamBuku();
       System.out.println(nama + " meminjam buku " + buku.judul);
    }

    public void kembalikanBuku(Buku buku) {
        buku.kembalikanBuku();
        System.out.println(nama + " mengembalikan buku " + buku.judul);
    }
}
