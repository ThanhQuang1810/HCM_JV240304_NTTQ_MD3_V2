package ss7.entity;

import ss7.design.IGenericCrud;
import ss7.util.InputMethods;

import java.util.regex.Pattern;

import static ss7.util.InputMethods.getString;

public class Students {
    private static int idCounter = 1;
    private int studentId;
    private String studentName;
    private String studentPhone;
    private String studentAddress;

    public Students() {
        this.studentId = ++idCounter;
    }

    public Students(int studentId, String studentName, String studentPhone, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentAddress = studentAddress;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Students.idCounter = idCounter;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        studentPhone = studentPhone;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        studentAddress = studentAddress;
    }

    public void inputData() {
        System.out.println("Nhập tên học sinh:");
        this.studentName = InputMethods.getString();
        while (this.studentName.isEmpty()) {
            System.err.println("Tên không được để trống");
            this.studentName = InputMethods.getString();
        }

        System.out.println("Nhập số điện thoại học sinh:");
        this.studentPhone = InputMethods.getString();
        while (!Pattern.matches("^0[35789]\\d{8}$", this.studentPhone)) {
            System.err.println("Vui lòng nhập đúng định dạng số điện thoại");
            this.studentPhone = InputMethods.getString();
        }

        System.out.println("Địa chỉ học sinh:");
        this.studentAddress = InputMethods.getString();
        while (this.studentAddress.isEmpty()) {
            System.err.println("Địa chỉ không được để trống");
            this.studentAddress = InputMethods.getString();
        }
    }


    @Override
    public String toString() {
        return "Students{" +
                "StudentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", StudentPhone='" + studentPhone + '\'' +
                ", StudentAddress='" + studentAddress + '\'' +
                '}';
    }


}
