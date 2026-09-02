import java.util.Scanner;

public class kalkulatorStruktural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Angka Pertama: ");
        int angka1 = sc.nextInt();

        System.out.print("Masukkan Operator (+, -, *, /): ");
        String operator = sc.next();

        System.out.print("Masukkan Angka Kedua: ");
        int angka2 = sc.nextInt();

        double hasil = hitung(angka1, operator, angka2);
        System.out.println("Hasil: " + hasil);

    }

    public static double hitung(int angka1, String operator, int angka2) {
        int hasil = 0;
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
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("Operator tidak valid");
        }
        return hasil;
    }
}