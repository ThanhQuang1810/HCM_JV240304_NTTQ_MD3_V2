package ss2;

import java.util.Scanner;

public class Bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("điểm toán : ");
        double math = scanner.nextDouble();
        System.out.print("điểm lý : ");
        double physics = scanner.nextDouble();
        System.out.print("điểm hóa : ");
        double chemistry = scanner.nextDouble();
        System.out.print("điểm văn : ");
        double literature = scanner.nextDouble();
        System.out.print    ("điểm anh : ");
        double english = scanner.nextDouble();
        double avg = (math + physics + chemistry + literature + english) / 5;

        if (avg < 5)
            System.out.println("học sinh yếu");
        else if (avg < 6.5)
            System.out.println("học sinh trung bình");
        else if (avg < 8)
            System.out.println("học sinh khá");
        else if (avg < 9)
            System.out.println("học sinh giỏi");
        else {
            System.out.println("học sinh xuất sắc");
        }
    }
}