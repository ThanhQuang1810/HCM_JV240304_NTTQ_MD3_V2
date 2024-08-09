package ss7.run;

import ss7.designimpl.StudentImplement;
import ss7.entity.Students;
import ss7.util.InputMethods;

public class Main {
    private static StudentImplement studentDesign = new StudentImplement();

    public static void main(String[] args) {
        while (true) {
            System.out.println("---------------------Management-----------------------");
            System.out.println("1. Quan ly lop");
            System.out.println("2. Quan ly hoc sinh");
            System.out.println("3. thoat");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    menuClasses();
                    break;
                case 2:
                    menuStudent();
                    break;
                case 3:
                    System.out.println("thoát");

                default:
                    System.err.println("lựa chọn không chinh xác, vui long nhập lại");
            }
            if (choice == 3) break;

        }
    }
    public static void menuClasses() {
        while (true) {
            System.out.println("----------------------Classes-Menu----------------------");
            System.out.println("1. thêm mới lớp");
            System.out.println("2. hiển thị ");
            System.out.println("3. sửa");
            System.out.println("4. xóa ");
            System.out.println("5. quai lại ");

            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("tam biet");
                default:
                    System.err.println("lựa chọn không chinh xác, vui long nhập lại");
            }
            if (choice == 5) break;

        }
    }

    public static void menuStudent() {
        while (true) {
            System.out.println("----------------------Student-Menu----------------------");
            System.out.println("1. thêm hoc sinh");
            System.out.println("2. hiển thị ");
            System.out.println("3. sửa");
            System.out.println("4. xóa ");
            System.out.println("5. quai lại ");

            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    System.out.println("Nhap so hoc sinh muon them:");
                    int n = InputMethods.getInt();
                    for(int i = 0; i < n; i++){
                        Students student = new Students();
                        student.inputData();
                        studentDesign.add(student);
                    }

                    break;
                case 2:
                    studentDesign.display();
                    break;
                case 3:
                    System.out.println("Nhập id muốn sửa:");
                    int idUpdate = InputMethods.getInt();

                    break;
                case 4:
                    System.out.println("Nhap id muon xoa:");
                    int idDelete = InputMethods.getInt();
                    studentDesign.delete(idDelete);

                    break;
                case 5:
                    System.out.println("tam biet");
                default:
                    System.err.println("lựa chọn không chinh xác, vui long nhập lại");
            }
            if (choice == 5) break;

        }
    }
}
