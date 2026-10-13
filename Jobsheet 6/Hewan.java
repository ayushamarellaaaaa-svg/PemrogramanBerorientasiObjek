public class Hewan {
    public String nama;
    public String jenis;
    public int umur;

    public Hewan() {
        System.out.println("Objek dari class Hewan dibuat");
    }

    public Hewan(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    public String getInfo() {
        String info = "";
        info += "Nama   : " + nama + "\n";
        info += "Jenis  : " + jenis + "\n";
        info += "Umur   : " + umur + "\n";

        return info;
    }
}
