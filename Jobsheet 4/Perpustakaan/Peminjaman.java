import java.util.ArrayList;

public class Peminjaman {
   private String idPeminjaman;
   private String tanggalPinjam;
   private String tanggalKembali;
   private Anggota anggota;
   private ArrayList<Buku> daftarBuku;

   public Peminjaman(String idPeminjaman, String tanggalPinjam, String tanggalKembali, Anggota anggota) {
      this.idPeminjaman = idPeminjaman;
      this.tanggalPinjam = tanggalPinjam;
      this.tanggalKembali = tanggalKembali;
      this.anggota = anggota;
      this.daftarBuku = new ArrayList<Buku>();
   }

   public String getIdPeminjaman() {
      return idPeminjaman;
   }

   public void setIdPeminjaman(String idPeminjaman) {
      this.idPeminjaman = idPeminjaman;
   }

   public String getTanggalPinjam() {
      return tanggalPinjam;
   }

   public void setTanggalPinjam(String tanggalPinjam) {
      this.tanggalPinjam = tanggalPinjam;
   }

   public String getTanggalKembali() {
      return tanggalKembali;
   }

   public void setTanggalKembali(String tanggalKembali) {
      this.tanggalKembali = tanggalKembali;
   }

   public Anggota getAnggota() {
      return anggota;
   }

   public void setAnggota(Anggota anggota) {
      this.anggota = anggota;
   }

   public void tambahBuku(Buku b) {
      if (daftarBuku.size() >= 3) {
         System.out.println("Gagal menambah " + b.getJudul() + ". Maksimal 3 buku setiap peminjaman");
      } else if (b.getStok() <= 0) {
         System.out.println("Gagal menambah " + b.getJudul() + ". Stok habis");
      } else {
         daftarBuku.add(b);
         b.kurangiStok();
      }
   }

   public int hitungJumlahBuku() {
      return daftarBuku.size();
   }

   public void tampilInfo() {
      System.out.println("ID Peminjaman   : " + idPeminjaman);
      System.out.println("Nama Peminjam   : " + anggota.getNama());
      System.out.println("Tanggal Pinjam  : " + tanggalPinjam);
      System.out.println("Tanggal Kembali : " + tanggalKembali);
      System.out.println("Jumlah Buku     : " + hitungJumlahBuku());
      System.out.println("Daftar Buku  : ");

      if (daftarBuku.isEmpty()) {
         System.out.println("\tBelum ada buku");
      } else {
         for (Buku buku : daftarBuku) {
            System.out.println("\t- " + buku.getKodeBuku() + " | " + buku.getJudul() + " | " + buku.getPengarang());
         }
      }
   }
}
