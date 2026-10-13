public class DemoParkir {
    public static void main(String[] args) {
        Mobil kendaraan1 = new Mobil("N 3304 ACA", "CRV", "Mobil SUV");
        Motor kendaraan2 = new Motor("N 2413 CR", "R15", "Motor Sport");
        Mobil kendaraan3 = new Mobil("3706", "BYD", "Mobil Listrik");

        System.out.println("=== Kendaraan jam masuk dan keluar valid ===");
        kendaraan1.masukParkir(8);
        kendaraan1.keluarParkir(11);
        System.out.println(kendaraan1.getInfo());

        System.out.println("=== Kendaraan yang masih parkir mencoba masuk lagi ===");
        kendaraan2.masukParkir(9);
        System.out.println(kendaraan2.getInfo());
        kendaraan2.masukParkir(10);
        System.out.println(kendaraan2.getInfo());

        System.out.println("=== Kendaraan yang belum parkir mencoba keluar ===");
        kendaraan3.keluarParkir(12);
        System.out.println(kendaraan3.getInfo());

        System.out.println("=== Waktu keluar lebih awal dari waktu masuk ===");
        kendaraan2.keluarParkir(8);
        System.out.println(kendaraan2.getInfo());

        System.out.println("=== Durasi tepat 2 jam ===");
        kendaraan3.masukParkir(10);
        System.out.println(kendaraan3.getInfo());
        kendaraan3.keluarParkir(12);
        System.out.println(kendaraan3.getInfo());

        System.out.println("=== Durasi lebih dari 2 jam ===");
        kendaraan2.keluarParkir(15);
        System.out.println(kendaraan2.getInfo());
 
    }
}
