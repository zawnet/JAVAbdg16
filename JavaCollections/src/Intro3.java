import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

public class Intro3 {
    public static void main(String[] args) {

        try {
            TreeSet setOfCompanies = FileManager.readFileToTreeSet(args[0]);
            Iterator iterator = setOfCompanies.iterator();

            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
