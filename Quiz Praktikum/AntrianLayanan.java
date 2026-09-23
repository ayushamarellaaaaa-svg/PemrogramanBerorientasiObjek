public class AntrianLayanan {
   private int nomorAntrian;
   private String identitasMahasiswa;
   private String jenisLayanan;
   private String status; 

   public AntrianLayanan(int nomorAntrian, String identitasMahasiswa, String jenisLayanan) {
      this.nomorAntrian = nomorAntrian;
      this.identitasMahasiswa = identitasMahasiswa;
      this.jenisLayanan = jenisLayanan;
      this.status = "Menunggu";
   }

   public int getNomorAntrian() {
      return nomorAntrian;
   }

   public String getIdentitasMahasiswa() {
      return identitasMahasiswa;
   }

   public String getJenisLayanan() {
      return jenisLayanan;
   }

   public String getStatus() {
      return status;
   }

   public boolean layani() {
      boolean berhasil = false;
      if(status.equals("Menunggu")) {
         status = "Dilayani";
         berhasil = true;
      }

      if(berhasil) {
         System.out.println("Antrian " + nomorAntrian + " mulai dilayani");
      } else {
         System.out.println("Antrian " + nomorAntrian + " tidak bisa dilayani karena statusnya bukan menunggu");
      }
      return berhasil;
   }

   public boolean selesai() {
      boolean berhasil = false;
      if(status.equals("Dilayani")) {
         status = "Selesai";
         berhasil = true;
      }

      if(berhasil) {
         System.out.println("Antrian " + nomorAntrian + " selesai dilayani");
      } else {
         System.out.println("Antrian " + nomorAntrian + " tidak bisa diselesaikan karena statusnya bukan dilayani");
      }
      return berhasil;
   }

   public boolean batalkan() {
      boolean berhasil = false;
      if(status.equals("Menunggu")) {
         status = "Batal";
         berhasil = true;
      }

      if(berhasil) {
         System.out.println("Antrian " + nomorAntrian + " dibatalkan");
      } else {
         System.out.println("Antrian " + nomorAntrian + " tidak bisa dibatalkan karena statusnya bukan menunggu");
      }
      return berhasil;
   }

   public void cetakInformasi() {
      System.out.println("=== Antrian Layanan ===");
      System.out.println("Nomor Antrian  : " + nomorAntrian);
      System.out.println("Nama Mahasiswa : " + identitasMahasiswa);
      System.out.println("Jenis Layanan  : " + jenisLayanan);
      System.out.println("Status Akhir   : " + status);
      System.out.println("=======================");
   }
}
