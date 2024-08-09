package ss7.entity;

import ss7.util.InputMethods;

import static ss7.util.InputMethods.*;

public class Classes {
    private String ClassName;
    private int ClassId;

    public Classes() {
    }

    public Classes(String className, int classId) {
        ClassName = className;
        ClassId = classId;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public int getClassId() {
        return ClassId;
    }

    public void setClassId(int classId) {
        ClassId = classId;
    }


public void InputData(){
    System.out.println("Tên lớp");
    this.ClassName= getString();

}

    @Override
    public String toString() {
        return "Classes{" +
                "ClassName='" + ClassName + '\'' +
                ", ClassId=" + ClassId +
                '}';
    }
}
