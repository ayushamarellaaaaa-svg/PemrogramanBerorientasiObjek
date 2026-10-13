public class Kucing extends Hewan {
    public String warnaBulu;

    public Kucing() {
        System.out.println("Objek dari class Kucing dibuat");
    }

    public Kucing(String nama, String jenis, int umur, String warnaBulu) {
        super(nama, jenis, umur);
        this.warnaBulu = warnaBulu;
        System.out.println("Objek dari class Kucing dibuat dengan constructor berparameter");
    }

    public String getInfo() {
        String info = super.getInfo();
        info += "Warna Bulu : " + this.warnaBulu + "\n";

        return info;
    }
}
