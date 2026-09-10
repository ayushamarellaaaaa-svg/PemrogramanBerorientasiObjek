package Teori_1;

public class film_struktural {
    public static void main(String[] args) {
        String judul1, judul2, judul3;
        int durasi1, durasi2, durasi3;
        int ditonton1, ditonton2, ditonton3;

        judul1 = "Laskar Pelangi";
        durasi1 = 125;
        ditonton1 = 40;

        judul2 = "Ada Apa Dengan Cinta";
        durasi2 = 111;
        ditonton2 = 60;

        judul3 = "Habibie & Ainun";
        durasi3 = 118;
        ditonton3 = 90;

        ditonton1 = tambahTonton(ditonton1, 30);
        ditonton2 = kurangTonton(ditonton2, 15);

        tampilkanInformasi(judul1, durasi1, ditonton1);
        tampilkanInformasi(judul2, durasi2, ditonton2);
        tampilkanInformasi(judul3, durasi3, ditonton3);
    }

    public static int tambahTonton(int ditonton, int menit) {
        ditonton += menit;
        return ditonton;
    }

    public static int kurangTonton(int ditonton, int menit) {
        ditonton -= menit;
        return ditonton;
    }

    public static void tampilkanInformasi(String judul, int durasi, int ditonton) {
        System.out.println("Judul   : " + judul);
        System.out.println("Durasi  : " + durasi);
        System.out.println("Ditonton: " + ditonton);
        System.out.println("------------------------");
    }
}