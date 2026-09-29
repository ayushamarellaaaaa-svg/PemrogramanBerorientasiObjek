public class Buku {
    private String kodeBuku;
    private String judul;
    private String pengarang;
    private int stok;

    public Buku(String kodeBuku, String judul, String pengarang, int stok) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.stok = stok;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void kurangiStok() {
        if (stok > 0) {
            stok--;
        } else {
            System.out.println("Stok buku " + judul + " sudah habis");
        }
    }

    public void tambahStok() {
        stok++;
    }

    public void tampilInfo() {
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul     : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Stok      : " + stok);
    }

}
