public class Mobil extends Kendaraan {
    private String tipeMobil;

    public Mobil(String platNomor, String merek, String tipeMobil) {
        super(platNomor, "Mobil",merek);
        this.tipeMobil = tipeMobil;
    }

    public String getTipeMobil() {
        return tipeMobil;
    }

    public String getInfo() {
        String info = super.getInfo();
        info += "Tipe Mobil    : " + this.tipeMobil + "\n";

        return info;
    }
    
}
