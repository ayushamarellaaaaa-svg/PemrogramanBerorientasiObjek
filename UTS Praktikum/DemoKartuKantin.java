public class DemoKartuKantin {
   public static void main(String[] args) {
        KartuMahasiswa kartu1 = new KartuMahasiswa("KTM-246", "Ayusha Marella", "254107060027");
        KartuDosen kartu2 = new KartuDosen("KTD-376", "Evelyn Hasanah", "197203042001121002");

        System.out.println("=== Informasi Kartu ===");
        System.out.println(kartu1.getInfo());
        System.out.println(kartu2.getInfo());
        
        System.out.println("=== Pengisian Saldo Rp50.000 ===");
        kartu1.isiSaldo(50000);
        System.out.print(kartu1.getInfo());
        System.out.println(kartu1.getHasilProses());

        System.out.println("=== Pembayaran Rp15.000 ===");
        kartu1.bayar(15000);
        System.out.print(kartu1.getInfo());
        System.out.println(kartu1.getHasilProses());
 
        System.out.println("=== Pembayaran Rp40.000, saldo tidak cukup ===");
        kartu1.bayar(40000);
        System.out.print(kartu1.getInfo());
        System.out.println(kartu1.getHasilProses());

        System.out.println("=== Pengisian Saldo Rp0 ===");
        kartu2.isiSaldo(0);
        System.out.print(kartu2.getInfo());
        System.out.println(kartu2.getHasilProses());
 
        System.out.println("=== Pengisian Saldo Rp-5.000 ===");
        kartu2.isiSaldo(-5000);
        System.out.print(kartu2.getInfo());
        System.out.println(kartu2.getHasilProses());
 
        System.out.println("=== Pembayaran Rp0 ===");
        kartu2.bayar(0);
        System.out.print(kartu2.getInfo());
        System.out.println(kartu2.getHasilProses());

        System.out.println("=== Pengisian Saldo Rp20.000 (rendah) ===");
        kartu2.isiSaldo(20000);
        System.out.print(kartu2.getInfo());
        System.out.println(kartu2.getHasilProses());

        System.out.println("=== Pengisian Saldo Rp105.000 (tinggi) ===");
        kartu2.isiSaldo(105000);
        System.out.print(kartu2.getInfo());
        System.out.println(kartu2.getHasilProses());
    }
}