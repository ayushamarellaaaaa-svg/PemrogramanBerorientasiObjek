package Teori_2;

public class DemoPerpustakaan {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.judul = "Pemrograman Berorientasi Objek";
        buku1.penulis = "Albert Enstein";
        buku1.tahunTerbit = 2020;
        buku1.kategori = "Teknologi";

        Anggota anggota1 = new Anggota();
        anggota1.nama = "Ayusha";
        anggota1.nim = "254107060027";
        anggota1.jurusan = "Teknologi Informasi";

        anggota1.tampilkanInfo();
        System.out.println();
        buku1.tampilkanInfo();
        System.out.println();

        anggota1.pinjamBuku(buku1);
        buku1.tampilkanInfo();
        System.out.println();

        anggota1.kembalikanBuku(buku1);
        buku1.tampilkanInfo();
        System.out.println();
    }
}
