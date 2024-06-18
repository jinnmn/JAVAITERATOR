import java.util.ArrayList;
import java.util.Iterator;

public class Stream implements Iterable<StudenrGroup> {
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
        String str = "Поток №" + id + ":\n";
        for (StudenrGroup studenrGroup : stream) {
            str =str +"\t" + studenrGroup.students +"\n";
        }
        return str;
    }

    @Override
    public Iterator<StudenrGroup> iterator() {
        return new StreamIterator(this);
     }

    
    
}
