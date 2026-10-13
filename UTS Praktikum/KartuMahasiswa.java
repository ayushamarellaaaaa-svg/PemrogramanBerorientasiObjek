public class KartuMahasiswa extends KartuKantin{
    private String nim;

    public KartuMahasiswa(String idKartu, String namaPemilik, String nim) {
        super(idKartu, namaPemilik);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public String getInfo() {
        String info = super.getInfo();
        info += "NIM              : " + this.nim + "\n";

        return info;
    }

}
