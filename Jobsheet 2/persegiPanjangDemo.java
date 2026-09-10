public class persegiPanjangDemo {
    public static void main(String[] args) {
        persegiPanjang pp1 = new persegiPanjang();
        pp1.panjang = 10;
        pp1.lebar = 5;

        pp1.displayInfo();
        System.out.println("Luas     : " + pp1.getLuas());
        System.out.println("Keliling : " + pp1.getKeliling());
    }
}
