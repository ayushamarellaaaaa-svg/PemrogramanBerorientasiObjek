package Teori_3;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    private double ipk;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, String alamat, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;

        if (ipk >= 0.00 && ipk <= 4.00) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK harus diantara 0.00 dan 4.00");
            this.ipk = 0.00;
        }
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getIPK() {
        return ipk;
    }

    public void setIPK(double ipk) {
        if (ipk >= 0.00 && ipk <= 4.00) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK harus diantara 0.00 dan 4.00");
        }
    }
}
