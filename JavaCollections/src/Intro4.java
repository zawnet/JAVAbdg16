import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Intro4 {
    public static void main(String[] args) throws IOException {
        try {
            ArrayList list = FileManager.readFileArrayList(args[0]);
            Collections.sort(list);
            Iterator iterator = list.iterator();
            for(int i = 1; iterator.hasNext(); i++){
                System.out.println(i+". "+iterator.next());
            }
        }
        catch (FileNotFoundException ex){
            ex.getMessage();
        }
    }
}
