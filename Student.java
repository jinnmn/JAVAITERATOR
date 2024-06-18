public class Student implements Comparable<Student>{
    public int id;
    public String name;
    
    @Override
    public String toString() {
        return this.name;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;

    }
    
    @Override
    public int compareTo(Student o) {
        // if (o.name.length() > this.name.length()) return 1;
        // else if (o.name.length() < this.name.length()) return -1;
        // else return 0;
        return -(o.name.length() - this.name.length());
    }



    

}
