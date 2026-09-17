public class TestKoperasi {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("111333444", "Donny", 5000000, 0);
        System.out.println("Nama Anggota: " + anggota1.getNama());
        System.out.println("Limit Pinjam: " + anggota1.getLimitPinjam());

        System.out.println("\nMeminjam uang 10.000.000");
        anggota1.pinjam(10000000);
        System.out.println("Jumlah pinjam anggota 1 saat ini: " + anggota1.getJumlahPinjam());

        System.out.println("\nMeminjam uang 4.000.000");
        anggota1.pinjam(4000000);
        System.out.println("Jumlah pinjam anggota 1 saat ini: " + anggota1.getJumlahPinjam());

        System.out.println("\nMembayar angsuran 1.000.000");
        anggota1.angsur(1000000);
        System.out.println("Jumlah pinjam saat ini: " + anggota1.getJumlahPinjam());

        System.out.println("\nMembayar angsuran 3.000.000");
        anggota1.angsur(3000000);
        System.out.println("Jumlah pinjam anggota 1 saat ini: " + anggota1.getJumlahPinjam());

        Anggota anggota2 = new Anggota("222333444", "Budi",10000000, 0);
        anggota2.pinjam(4000000);
        System.out.println("\nJumlah pinjam anggota 2 saat ini: " +anggota2.getJumlahPinjam());
        System.out.println("\nMembayar angsuran 100.000");
        anggota2.angsur(100000);
        System.out.println("Jumlah pinjam anggota 2 saat ini: " + anggota2.getJumlahPinjam());
    }
}
