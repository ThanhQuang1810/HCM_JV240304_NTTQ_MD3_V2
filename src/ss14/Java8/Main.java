package ss14.Java8;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> arr = new HashSet<>();

        while (arr.size() < 100) {
            int number = random.nextInt(1001); // Tạo số ngẫu nhiên từ 0 đến 1000
            arr.add(number);
        }

        // Chuyển Set thành mảng
        Integer[] numbersArray = arr.toArray(new Integer[0]);
Arrays.sort(numbersArray,Collections.reverseOrder());


    }
}
