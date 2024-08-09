package ss15_16;

import java.util.Scanner;

public class Baitapjava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//  bt1
//        List<Integer> arr = new ArrayList<>();
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            int randomNum = random.nextInt(100);
//            arr.add(randomNum);
//        }
//
//        System.out.println("Các số ngẫu nhiên đã thêm vào danh sách: " + arr);
//        int check = -1;
//        System.out.printf("nhập dữ liệu :");
//        int value = scanner.nextInt();
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.get(i).equals(value))
//                check=i;
//        }
//        System.out.println(check);


//  bt2
//        List<Integer> arr = new ArrayList<>();
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            int randomNum = random.nextInt(100);
//            arr.add(randomNum);
//        }
//        arr.sort(Comparator.comparingInt(o -> o));
//        System.out.println("Các số ngẫu nhiên đã thêm vào danh sách: " + arr);
//        System.out.printf("nhập dữ liệu :");
//        int value = scanner.nextInt();
//        int left = 0;
//        int right = arr.size() - 1;
//        int i = -1;
//        while (right >= left) {
//            int mid = (right + left) / 2;
//            if (arr.get(mid).equals(value)) {
//                i = mid;
//                break;
//            } else if (arr.get(mid) > value) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//        System.out.println(i);


//  bt3,4
//        List<Integer> arr = new ArrayList<>();
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            int randomNum = random.nextInt(100);
//            arr.add(randomNum);
//        }
//
//        System.out.println("Các số ngẫu nhiên đã thêm vào danh sách: " + arr);
//       int count=0;
//        boolean check = true;
//        for (int i = 0; i < arr.size() && check; i++) {
//            check = false;
//            for (int j = 0; j < arr.size() - 1-i; j++) {
//                if (arr.get(j) > arr.get(j + 1)) {
//                    int temp = arr.get(j);
//                    arr.set(j, arr.get(j + 1));
//                    arr.set(j + 1, temp);
//                    count++;
//                    check = true;
//                }
//            }
//        }
//        System.out.println("Các số ngẫu nhiên đã thêm vào danh sách: " + arr);
//        System.out.println("Số lần đổi chỗ: " + count);

//  Bt4



    }
}


