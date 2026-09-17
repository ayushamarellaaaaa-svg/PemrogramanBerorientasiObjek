public class PersegiPanjangDemo {
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 10;
        pp1.lebar = 5;

        pp1.displayInfo();
        System.out.println("Luas     : " + pp1.getLuas());
        System.out.println("Keliling : " + pp1.getKeliling());

        PersegiPanjang pp2 = new PersegiPanjang();
        pp2.panjang = 20;
        pp2.lebar = 10;
        pp2.displayInfo();
    }
}
