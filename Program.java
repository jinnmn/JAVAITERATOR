import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        StudenrGroup group = new StudenrGroup();

        Student ivan = new Student("Ivan");
        Student igor = new Student("Igor");
        Student alex = new Student("Alex");

        group.addStudent(ivan);
        group.addStudent(igor);
        group.addStudent(alex);
        // System.out.println(group.students);

        Iterator<Student> iterator = new StudentGroupIterator(group);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
