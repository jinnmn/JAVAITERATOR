import java.util.ArrayList;

import javax.sql.rowset.spi.XmlReader;

public class Stream {
    public int id;
    public ArrayList<StudenrGroup> stream; 
    private static int count = 1 ; 

    public void addGroup(StudenrGroup group) {
        this.stream.add(group);
    }

    public Stream() {
        this.id = count;
        this.stream = new ArrayList<StudenrGroup>();
        count++;
    }

    @Override
    public String toString() {
        String str = "Группа №" + id + ":\n";
        for (StudenrGroup studenrGroup : stream) {
            str =str +"\t" + studenrGroup.students;
        }
        return str;
    }

    
    
}
