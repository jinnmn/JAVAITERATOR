import java.util.Iterator;

public class StreamIterator implements Iterator<StudenrGroup> {

    private Stream stream;
    private int index = 0;
    public StreamIterator(Stream stream) {
        this.stream = stream;
    }

    @Override
    public boolean hasNext() {
        return index < stream.stream.size();    
    }

    @Override
    public StudenrGroup next() {
      return stream.stream.get(index++);
    }

    
    
}
