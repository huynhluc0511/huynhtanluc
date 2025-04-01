package packagebai12;
import java.util.Scanner;
public class SoDoiXung {
    public static boolean sodoixung(int num) {
        int originalNum = num; 
        int daoNguoc = 0;

        while (num != 0) {
            int digit = num % 10; 
            daoNguoc = daoNguoc * 10 + digit; 
            num /= 10; 
        }

        return sogoc == daoNguoc;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int num = scanner.nextInt();

        if (sodoixung(num)) {
            System.out.println(num + " là số đối xứng.");
        } else {
            System.out.println(num + " không phải là số đối xứng.");
        }

    }
}
