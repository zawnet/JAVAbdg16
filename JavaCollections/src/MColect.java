import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class MColect {
    /**
     * Make object of class specified by mgr object
     * based on information from txt file named fname
     * and adding this to c collection
     * @param c
     * @param fname
     * @param mgr
     */
    public static void makeCollectionFromFile(Collection c, String fname, CollectionHelper mgr){
        try{
            BufferedReader in = new BufferedReader(new FileReader(fname));
            String line;
            while ((line = in.readLine()) != null){
                mgr.makeObjectAndCollect(line,c);
            }
        } catch (FileNotFoundException e){
            e.getMessage();
        } catch (IOException e){
            e.getMessage();
        }
    }

    /**
     * Removing  objests which are to removed
     * on the results from isRedyToRemove from c collections
     * @param c
     */
    public static void iterRemove(Collection c){
        Iterator iterator  = c.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            CollectionHelper elt = (CollectionHelper) o;
            if(elt.isReadyToRemove()){
                iterator.remove();
            }
        }
    }

    /**
     * Print on console all elements of collection c
     * using for loop
     * @param c
     */
    public static void show(Collection c){
        for (Iterator iterator = c.iterator();iterator.hasNext();){
            System.out.println(iterator.next().toString());
        }
    }

    /**
     * Print on console all elements of collection c
     * using while loop
     * @param c
     */
    public static void show2(Collection c){
        Iterator iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    public static void main(String[] args) {
        new Inter1(args[0], args[1]);
    }
}
