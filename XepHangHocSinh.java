package packagenhapdiem;
import java.util.Scanner;
public class XepHangHocSinh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm môn Lý: ");
        double ly = scanner.nextDouble();
        System.out.print("Nhập diem mon hoa:");
        double hoa = scanner.nextDouble();

        System.out.print("Nhập điểm môn Sinh: ");
        double sinh = scanner.nextDouble();

        System.out.print("Nhập điểm môn Toán: ");
        double toan = scanner.nextDouble();

        System.out.print("Nhập điểm môn Máy tính: ");
        double mayTinh = scanner.nextDouble();

        double tongDiem = ly + hoa + sinh + toan + mayTinh;
        double tyLePhanTram = (tongDiem / 50) * 100;

        System.out.println("Tỷ lệ phần trăm: " + tyLePhanTram + "%");
        String hang;
        if (tyLePhanTram > 90) {
            hang = "Hạng A";
        } else if (tyLePhanTram > 80) {
            hang = "Hạng B";
        } else if (tyLePhanTram > 70) {
            hang = "Hạng C";
        } else if (tyLePhanTram > 60) {
            hang = "Hạng D";
        } else if (tyLePhanTram > 40) {
            hang = "Hạng E";
        } else {
            hang = "Hạng F";
        }
        System.out.println("Kết quả xếp hạng: " + hang);

    }
}
System.out.print("Nhập điểm môn Sinh: ");
System.out.print("Nhập nhiệt độ (độ F):" + doF);