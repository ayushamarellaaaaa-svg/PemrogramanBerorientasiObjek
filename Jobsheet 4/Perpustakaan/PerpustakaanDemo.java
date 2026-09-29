public class PerpustakaanDemo {
    public static void main(String[] args) {
        Buku buku1 = new Buku("B001", "Pemrograman Website", "Budi Santoso", 3);
        Buku buku2 = new Buku("B002", "Pemrograman Berorientasi Objek", "Rudi Hartanto", 2);
        Buku buku3 = new Buku("B003", "Basis Data", "Ahmad Fawwaz", 1);
        Buku buku4 = new Buku("B004", "Jaringan Komputer", "Yulia Putri", 4);

        Anggota anggota1 = new Anggota("A001", "Ayusha Marella", "Sistem Informasi Bisnis");
        Anggota anggota2 = new Anggota("A002", "Rizal Maulana", "Teknik Informatika");

        Peminjaman p1 = new Peminjaman("P001", "2026-09-01", "2026-09-08", anggota1);
        p1.tambahBuku(buku1);
        p1.tambahBuku(buku2);
        anggota1.tambahPeminjaman(p1);

        Peminjaman p2 = new Peminjaman("P002", "2026-09-15", "2026-09-22", anggota1);
        p2.tambahBuku(buku1);
        p2.tambahBuku(buku3);
        p2.tambahBuku(buku4);
        p2.tambahBuku(buku2);
        anggota1.tambahPeminjaman(p2);

        System.out.println("\n=== Riwayat Peminjaman Anggota 1 ===");
        anggota1.tampilRiwayat();

        System.out.println("\n=== Riwayat Peminjaman Anggota 2 ===");
        anggota2.tampilRiwayat();

        System.out.println();
        System.out.println("=== Informasi Buku setelah Peminjaman ===");
        buku1.tampilInfo();
        System.out.println();
        buku2.tampilInfo();
    }
}
