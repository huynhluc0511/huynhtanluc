package packagegiatrinhohatbaso;
import java.util.Scanner;
public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập ba số nguyên:");
        System.out.print("Số thứ nhất: ");
        int so1 = scanner.nextInt();
        System.out.print("Số thứ hai: ");
        int so2 = scanner.nextInt();
        System.out.print("Số thứ ba: ");
        int so3 = scanner.nextInt();

        int giaTriNhoNhat = so1;

        if (so2 < giaTriNhoNhat) {
            giaTriNhoNhat = so2;

        if (so3 < giaTriNhoNhat)
            giaTriNhoNhat = so3;
        }

        System.out.println("Giá trị nhỏ nhất là: " + giaTriNhoNhat);
    }
}