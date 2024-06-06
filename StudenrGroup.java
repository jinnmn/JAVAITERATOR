

public class StudenrGroup {
    public StringBuilder students = new StringBuilder();
    public void addStudent(Student student) {
        students.append(student).append(" ");
    }
}
