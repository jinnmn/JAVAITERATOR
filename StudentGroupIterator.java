import java.util.Arrays;
import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {

    private StudenrGroup group;
    private int index = 0;
    public StudentGroupIterator(StudenrGroup group) {
        this.group = group;
    }

    private Student[] getStudents() {
        String[] names = group.students
        .toString().split(" "); 
        Student[] students = new Student[names.length];
        int count = 0;
        for (String name : names) {
           students[count] = new Student(name);
           count++;

        }//  System.out.println(Arrays.toString(names)); 
        return students;
    }


    @Override
    public boolean hasNext() {
        return index < getStudents().length;
    }

    @Override
    public Student next() {
        Student[] students = getStudents();
        return students[index++];     
    }

    
}   