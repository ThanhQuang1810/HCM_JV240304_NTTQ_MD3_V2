package ss14.Bt1;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNum = random.nextInt(100);
            arr.add(randomNum);
        }

        System.out.println("Các số ngẫu nhiên đã thêm vào danh sách: " + arr);

        Integer max = arr.stream()
                .sorted((o1, o2) -> o2 - o1)
                .findFirst().orElse(null);
        System.out.println("Số lớn nhất trong danh sách là: " + max);

        arr.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào một số: ");
        int n = scanner.nextInt();
        arr.stream().filter(i -> i > n).forEach(System.out::println);

        int sum = arr.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Tổng là : " + sum);

        boolean hasEvenNumber = arr.stream()
                .anyMatch(num -> num % 2 == 0);

        if (hasEvenNumber) {
            System.out.println("Danh sách chứa ít nhất một số chẵn.");
        } else {
            System.out.println("Danh sách không chứa số chẵn nào.");
        }

        int x = 5; // Giá trị bắt đầu
        int y = 15; // Giá trị kết thúc (không bao gồm y)

        List<Integer> rangeNumbers = IntStream.range(x, y) // Tạo IntStream từ x đến y - 1
                .boxed() // Chuyển đổi IntStream thành Stream<Integer>
                .collect(Collectors.toList()); // Thu thập thành danh sách

        // Hiển thị danh sách các số từ x đến y - 1
        System.out.println("Danh sách các số từ " + x + " đến " + (y - 1) + ": " + rangeNumbers);

        List<String> names = new ArrayList<>();
        names.add("Bohn");
        names.add("Jane");
        names.add("Mike");
        names.add("Sarah");

        names.stream().sorted().forEach(System.out::println);
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }


}

