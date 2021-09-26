import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


interface FileManager {
    public static HashSet readFileToSet(String filePath) throws IOException {
        try {
            BufferedReader in = new BufferedReader(new FileReader(filePath));
            HashSet setOfComapanies = new HashSet();
            String companyName;
            while ((companyName = in.readLine()) != null){
                setOfComapanies.add(companyName);
            }
            return setOfComapanies;
        }
        catch (NoSuchFileException ex){
            System.out.println(ex.getMessage());
            return null; //It's not elegant  :)
        }
    }

    public static TreeSet readFileToTreeSet(String filePath) throws IOException {
        try {
            BufferedReader in = new BufferedReader(new FileReader(filePath));
            TreeSet setOfComapanies = new TreeSet();
            String companyName;
            while ((companyName = in.readLine()) != null){
                setOfComapanies.add(companyName);
            }
            return setOfComapanies;
        }
        catch (NoSuchFileException ex){
            System.out.println(ex.getMessage());
            return null; //It's not elegant  :)
        }
    }
    public static ArrayList readFileArrayList(String filePath) throws IOException {
        try {
            BufferedReader in = new BufferedReader(new FileReader(filePath));
            ArrayList arrayOfComapanies = new ArrayList();
            String companyName;
            while ((companyName = in.readLine()) != null){
                arrayOfComapanies.add(companyName);
            }
            return arrayOfComapanies;
        }
        catch (NoSuchFileException ex){
            System.out.println(ex.getMessage());
            return null; //It's not elegant  :)
        }
    }
}
