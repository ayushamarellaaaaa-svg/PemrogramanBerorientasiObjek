import java.util.Scanner;

public class kalkulatorPBO {
    public int angka1;
    public int angka2;
    public String operator;

    public kalkulatorPBO(int angka1, String operator, int angka2) {
        this.angka1 = angka1;
        this.operator = operator;
        this.angka2 = angka2;
    }

    public double hitung() {
        double hasil = 0;
        switch (operator) {
            case "+":
                hasil = angka1 + angka2;
                break;
            case "-":
                hasil = angka1 - angka2;
                break;
            case "*":
                hasil = angka1 * angka2;
                break;
            case "/":
                hasil = (double) angka1 / angka2;
                break;
            default:
                System.out.println("Operator tidak valid");
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Angka Pertama: ");
        int angka1 = sc.nextInt();

        System.out.print("Masukkan Operator (+, -, *, /): ");
        String operator = sc.next();

        System.out.print("Masukkan Angka Kedua: ");
        int angka2 = sc.nextInt();

        kalkulatorPBO kalkulator = new kalkulatorPBO(angka1, operator, angka2);
        double hasil = kalkulator.hitung();
        System.out.println("Hasil: " + hasil);
    }
}
