public class KartuKantin {
    private String idKartu;
    private String namaPemilik;
    private int saldo;
    private int jumlahTransaksi;
    private boolean prosesBerhasil;
    private String pesan;

    public KartuKantin(String idKartu, String namaPemilik) {
        this.idKartu = idKartu;
        this.namaPemilik = namaPemilik;
        this.saldo = 0;
        this.jumlahTransaksi = 0;
        this.prosesBerhasil = false;
        this.pesan = "";
    }

    public String getIdKartu() {
        return idKartu;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getJumlahTransaksi() {
        return jumlahTransaksi;
    }

    public String getPesan() {
        return pesan;
    }

    public String getKategoriSaldo() {
        if (saldo < 25000) {
            return "Rendah";
        } else if (saldo <= 100000) {
            return "Sedang";
        } else {
            return "Tinggi";
        }
    }

    public boolean isiSaldo(int nominal) {
        prosesBerhasil = false;
        if (nominal <= 0) {
            pesan = "Nominal pengisian harus lebih dari 0";
            return false; 
        }
        saldo += nominal;
        prosesBerhasil = true;
        pesan = "Pengisian saldo berhasil. Saldo saat ini: " + nominal;
        return true;
    }

    public boolean bayar(int jumlah) {
        prosesBerhasil = false;
        if (jumlah <= 0) {
            pesan = "Jumlah pembayaran harus lebih dari 0";
            return false;
        }
        if (jumlah > saldo) {
            pesan = "Saldo tidak cukup untuk melakukan pembayaran. Saldo saat ini: " + saldo;
            return false;
        }
        saldo -= jumlah;
        jumlahTransaksi++;
        prosesBerhasil = true;
        pesan = "Berhasil melakukan pembayaran dengan jumlah: " + jumlah;
        return true;
    }

    public String getInfo() {
        String info = "";
        info += "ID Kartu         : " + this.idKartu + "\n";    
        info += "Nama Pemilik     : " + this.namaPemilik + "\n";
        info += "Saldo            : " + this.saldo + "\n";
        info += "Jumlah Transaksi : " + this.jumlahTransaksi + "\n";
        info += "Kategori Saldo   : " + this.getKategoriSaldo() + "\n";
        return info;
    }

    public String getHasilProses() {
        if (prosesBerhasil) {
            return "Pesan            : " + pesan + "\n";
        } else {
            return "Ditolak          : " + pesan + "\n";
        }
    }
}
