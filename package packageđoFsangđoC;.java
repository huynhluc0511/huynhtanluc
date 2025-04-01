package packageđoFsangđoC;
import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập nhiệt độ (độ F):" + doF);
        double doF = scanner.nextDouble();
        double doC = (doF - 32) / 1.8;
        System.out.println("Nhiệt độ tương ứng (độ C): " + doC);
    }
}