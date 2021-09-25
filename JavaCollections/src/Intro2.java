import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Intro2 {

    public static void main(String[] args) throws IOException {
        try {

            BufferedReader in = new BufferedReader(new FileReader(args[0]));
            HashSet setOfComapanies = new HashSet();
            String companyName;
            while ((companyName = in.readLine()) != null){
                setOfComapanies.add(companyName);
            }
            //Because in sets aren't indexes, we must use itereator to read it.
            Iterator iterator = setOfComapanies.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
    }
}
