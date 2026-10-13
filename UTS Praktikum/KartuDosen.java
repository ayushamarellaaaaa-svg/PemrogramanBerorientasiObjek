public class KartuDosen extends KartuKantin{
    private String nip;

    public KartuDosen(String idKartu, String namaPemilik, String nip) {
        super(idKartu, namaPemilik);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public String getInfo() {
        String info = super.getInfo();
        info += "NIP              : " + this.nip + "\n";

        return info;
    }
}
