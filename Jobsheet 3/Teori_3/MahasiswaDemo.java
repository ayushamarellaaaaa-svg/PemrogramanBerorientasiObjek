package Teori_3;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNama("Ayusha Marella");
        mhs1.setAlamat("Malang");
        mhs1.setIPK(3.5);

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNama("Yulia Anisa");
        mhs2.setAlamat("Batu");
        mhs2.setIPK(3.6);

        System.out.println("=== Data Mahasiswa 1 ===");
        System.out.println("NIM    : " + mhs1.getNim());
        System.out.println("Nama   : " + mhs1.getNama());
        System.out.println("Alamat : " + mhs1.getAlamat());
        System.out.println("IPK    : " + mhs1.getIPK());

        System.out.println("\n=== Data Mahasiswa 2 ===");
        System.out.println("NIM    : " + mhs2.getNim());
        System.out.println("Nama   : " + mhs2.getNama());
        System.out.println("Alamat : " + mhs2.getAlamat());
        System.out.println("IPK    : " + mhs2.getIPK());

        mhs1.setNama("Ayusha Marella Arisanti");
        mhs1.setAlamat("Malang, Jawa Timur");
        mhs1.setIPK(3.8);

        System.out.println("\n=== Data Mahasiswa 1 Setelah Diubah ===");
        System.out.println("NIM    : " + mhs1.getNim());
        System.out.println("Nama   : " + mhs1.getNama());
        System.out.println("Alamat : " + mhs1.getAlamat());
        System.out.println("IPK    : " + mhs1.getIPK());

        // System.out.println(mhs1.nama);
    }
}
