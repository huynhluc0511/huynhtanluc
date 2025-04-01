package packagenhapdiem5mon;
import java.util.Scanner;
public class Xephanghocsinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập điểm môn Lý: ");
        double ly = scanner.nextDouble();
        System.out.println("Nhập điểm môn Hóa: ");
        double hoa = scanner.nextDouble();
        System.out.println("Nhập điểm môn Sinh: ");
        double sinh = scanner.nextDouble();
        System.out.println("Nhập điểm môn Toán: ");
        double toan= scanner.nextDouble();
        System.out.println("Nhập điểm môn Máy tính: ");
        double maytinh = scanner.nextDouble();

        double tongdiem = ly + hoa + sinh + toan + maytinh;
        double tylephantram = (totalMarks / 50) * 100; 


        String hang;
        if (tylephantram > 90) {
            grade = "Hạng A";
        } else if ( tylephantram> 80) {
            grade = "Hạng B";
        } else if (tylephantram > 70) {
            grade = "Hạng C";
        } else if (tylephantram > 60) {
            grade = "Hạng D";
        } else if (tylephantramphantram > 40) {
            grade = "Hạng E";
        } else {
            grade = "Hạng F";
        }

        System.out.println("Tỷ lệ phần trăm: " + phantram + "%");
        System.out.println("Hạng: " + hang);

        scanner.close();
    }
}