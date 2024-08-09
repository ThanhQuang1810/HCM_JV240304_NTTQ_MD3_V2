package ss7.designimpl;

import ss7.design.IStudentDesign;
import ss7.entity.Students;

public class StudentImplement implements IStudentDesign {

    public int size;
    Students[] st1 = new Students[size];



    @Override
    public void add(Students students) {
        Students[] newStudents = new Students[size + 1];
        if (size >= 0) System.arraycopy(st1, 0, newStudents, 0, size);
        newStudents[newStudents.length-1] = students;

        st1 = newStudents;
        size++;
    }

    @Override
    public void update(Students students) {


    }

    @Override
    public void delete(Integer id) {
        int index = -1;
        for(int i = 0 ; i < size; i++){
            if(id == st1[i].getStudentId()){
                index = i;
                break;
            }
        }
        if(index == -1) System.err.println("Ko co id");
        else{
            Students[] newStudents = new Students[size - 1];
            for(int i = 0 ; i < newStudents.length;i++){
                if( i < index) newStudents[i] = st1[i];
                else  newStudents[i] = st1[i+1];
            }
            st1 = newStudents;
            size--;
        }

    }

    @Override
    public void display() {
        for (Students student : st1) {
            System.out.println(student);
        }
    }

}
