import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        StudenrGroup group = new StudenrGroup();

        Student ivan = new Student("Ivanushka", 2);
        Student igor = new Student("Igor", 3);
        Student alex = new Student("Alexxx", 1);

        group.addStudent(ivan);
        group.addStudent(igor);
        group.addStudent(alex);
        // System.out.println(group.students);

        Iterator<Student> iterator = new StudentGroupIterator(group);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Student student : group) {
            System.out.println(student);
        }
        ArrayList<Student> arrayList = new ArrayList<>(List.of(ivan, igor, alex));
        System.out.println(arrayList);
        Collections.sort(arrayList, (s1 , s2) -> s1.id - s2.id);
        System.out.println(arrayList);

    }
}
