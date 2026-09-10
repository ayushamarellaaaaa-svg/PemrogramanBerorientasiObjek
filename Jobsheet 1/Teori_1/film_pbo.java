package Teori_1;

public class film_pbo {
    public String judul;
    public int durasi, durasi_ditonton;

    public film_pbo(String judul, int durasi, int durasi_ditonton) {
        this.judul = judul;
        this.durasi = durasi;
        this.durasi_ditonton = durasi_ditonton;
    }

    public int tambahTonton(int menit) {
        durasi_ditonton += menit;
        return durasi_ditonton;
    }

    public int kurangTonton(int menit) {
        durasi_ditonton -= menit;
        return durasi_ditonton;
    }

    public void info() {
        System.out.println("Judul: " + judul);
        System.out.println("Durasi: " + durasi);
        System.out.println("Durasi Ditonton: " + durasi_ditonton);
    }

    public static void main(String[] args) {
        film_pbo film1 = new film_pbo("Laskar Pelangi", 125, 40);
        film1.tambahTonton(30);
        film1.info();
        System.out.println();

        film_pbo film2 = new film_pbo("Ada Apa Dengan Cinta", 111, 60);
        film2.kurangTonton(15);
        film2.info();
    }
}
