package packagedientichhinhchunhat;
import java.util.Scanner;
public class Dientichhinnhchunhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu rong hinh chu nhat: "+ chieurong);
        double chieurong = scanner.nextDouble();

        System.out.print("Nhap chieu dai hinh chu nhat: "+ chieudai);
        double chieudai = scanner.nextDouble();

        double dientich = chieurong * chieudai;

        System.out.println("Diện tích hình chữ nhật là: " + dientich);
    }
}