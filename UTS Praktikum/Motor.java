public class Motor extends Kendaraan {
    private String tipeMotor;

    public Motor(String platNomor, String merek, String tipeMotor) {
        super(platNomor, "Motor", merek);
        this.tipeMotor = tipeMotor;
    }

    public String getTipeMotor() {
        return tipeMotor;
    }

    public String getInfo() {
        String info = super.getInfo();
        info += "Tipe Motor    : " + this.tipeMotor + "\n";

        return info;
    }
}