import java.util.ArrayList;
import java.util.Iterator;


public class Program {
    public static void main(String[] args) {
        StudenrGroup group = new StudenrGroup();
        StudenrGroup group1 = new StudenrGroup();

        Student ivan = new Student("Ivanushka", 2);
        Student igor = new Student("Igor", 3);
        Student alex = new Student("Alexxx", 1);
        Student mitya = new Student("Mitya", 4);


        group.addStudent(ivan);
        group.addStudent(igor);
        group.addStudent(alex);
        group1.addStudent(mitya);
        System.out.println(group.students);
        
        //------------
        Stream stream1 = new Stream();
        Stream stream2 = new Stream();
        stream1.addGroup(group);
        stream2.addGroup(group);
        stream2.addGroup(group1);
        System.out.println(stream1);
        System.out.println(stream2);

        Iterator<StudenrGroup> sIterator = new StreamIterator(stream2);

        while (sIterator.hasNext()) {
            System.out.println(sIterator.next().students);
        }
        ArrayList<Stream> x = StreamService.streams;
        System.out.println(x);
        StreamService.sSort(x);
        System.out.println(x);



        // //-------------
        // Iterator<Student> iterator = new StudentGroupIterator(group);

        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        // for (Student student : group) {
        //     System.out.println(student);
        // }
        // ArrayList<Student> arrayList = new ArrayList<>(List.of(ivan, igor, alex));
        // System.out.println(arrayList);
        // Collections.sort(arrayList, (s1 , s2) -> s1.id - s2.id);
        // System.out.println(arrayList);

    }
}
