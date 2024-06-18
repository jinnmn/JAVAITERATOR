import java.util.ArrayList;
import java.util.Collections;

public class StreamService  {

    public static ArrayList<Stream> streams 
    = new ArrayList<>();

    public static void sSort(ArrayList<Stream> streams) {
        Collections.sort(streams,new StreamComporator());
    }



}
