package ss2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMethod {
    public static Integer getInt() {
        while (true) try {
            return getScanner().nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Vui lòng nhập số");
        }
    }
    public static LocalDate getDate() {
        while (true) {
            try {
                String dateStr =getScanner().nextLine();
                return LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            } catch (DateTimeParseException e) {
                System.err.println("Ngày tháng không đúng định dạng (dd/MM/yyyy)");
            }
        }
    }


    private static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static void main(String[] args) {
        System.out.println("hãy nhập ngày/tháng/năm");
        LocalDate n = getDate();
    }
}
