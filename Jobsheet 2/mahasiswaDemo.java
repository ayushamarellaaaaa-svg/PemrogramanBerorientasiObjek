public class mahasiswaDemo {
    public static void main(String[] args) {
        mahasiswa m1 = new mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        m1.displayBiodata();

        mahasiswa m2 = new mahasiswa();
        m2.nim = "023433";
        m2.nama = "Rizky Ramadhan";
        m2.alamat = "Medan, Sumatera Utara";
        m2.kelas = "2B";
        m2.displayBiodata();

        mahasiswa m3 = new mahasiswa();
        m3.nim = "023434";
        m3.nama = "Dewi Lestari";
        m3.alamat = "Padang, Sumatera Barat";
        m3.kelas = "2C";
        m3.displayBiodata();
    }
}