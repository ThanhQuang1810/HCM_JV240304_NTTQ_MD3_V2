package ss2;

import java.util.Scanner;

public class Bt8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println(" -----MENU----- ");
            System.out.println(" 1. Kiểm tra chẵn lẻ của 1 số ");
            System.out.println(" 2. Kiểm tra số nguyên tố ");
            System.out.println(" 3. Kiểm tra 1 số có chia hết cho 3 không ");
            System.out.println(" 4. Thoát ");
            System.out.print("Nhập lựa chọn của bạn: ");
            select = scanner.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Kiểm tra chẵn lẻ");
                    System.out.print("Nhập số: ");
                    int a = scanner.nextInt();
                    if (a % 2 == 0) {
                        System.out.println("Số chẵn");
                    } else {
                        System.out.println("Số lẻ");
                    }
                    break;
                case 2:
                    System.out.println("Kiểm tra số nguyên tố");
                    System.out.print("Nhập số: ");
                    int b = scanner.nextInt();
                    boolean isPrime = true;
                    if (b > 1) {
                        for (int i = 2; i <= Math.sqrt(b); i++) {
                            if (b % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            System.out.println("Số nguyên tố");
                        } else {
                            System.out.println("Không phải số nguyên tố");
                        }
                    } else {
                        System.out.println("Không phải số nguyên tố");
                    }
                    break;
                case 3:
                    System.out.println("Kiểm tra số chia hết cho 3");
                    System.out.print("Nhập số: ");
                    int c = scanner.nextInt();
                    if (c % 3 == 0) {
                        System.out.println("Số nhập vào là số chia hết cho 3");
                    } else {
                        System.out.println("Số nhập vào không chia hết cho 3");
                    }
                    break;
                case 4:
                    System.out.println("Đã thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        } while (select != 4);
    }
}
