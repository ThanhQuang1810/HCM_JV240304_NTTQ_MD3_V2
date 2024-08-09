package ss3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" thực hiện chương trình ");
        while (true) {
            System.out.println(" ");
            System.out.println("--------------Menu-------------");
            System.out.println("1. Hiển thị");
            System.out.println("2. Thêm mới");
            System.out.println("3. Xóa");
            System.out.println("4. Sửa");
            System.out.println("5. Thoát");
            System.out.println("Nhập lựa chọn");
            byte choice = new Scanner(System.in).nextByte();
            switch (choice) {
                case 1:
                  NumberManager.viewArray();
                    break;
                case 2:
                    int random = new Random().nextInt(1000);
                    NumberManager.addInt(random);
                    break;
                case 3:
                    System.out.println("Nhập index cần xóa");
                    int index = new Scanner(System.in).nextInt();
                    NumberManager.removeInt(index);
                    break;
                case 4:
                    System.out.println("Nhập index cần sửa");
                    int indexUpdate = new Scanner(System.in).nextInt();
                    System.out.println("Nhập số");
                    int number = new Scanner(System.in).nextInt();
                    NumberManager.updateInt(indexUpdate,number);
                    break;
                case 5:
                    System.exit(0);
                default:
            }}
    }
}
