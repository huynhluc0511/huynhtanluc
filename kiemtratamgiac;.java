package packagekiemtratamgiac;
import java.util.Scanner;

public class tamgiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập độ dài cạnh a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập độ dài cạnh b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập độ dài cạnh c: ");
        double c = scanner.nextDouble();

        if (tamgiac(a, b, c)) {
            System.out.println("Tam giác hợp lệ.");
        } else {
            System.out.println("Tam giác không hợp lệ.");
        }
    }

    public static boolean tamgiac(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}