import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Intro1 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader in = new BufferedReader(new FileReader(args[0]));
            ArrayList companyList = new ArrayList();
            String companyname;
            while ((companyname = in.readLine()) != null) {
                companyList.add(companyname);
            }

           // for (Object company : companyList) {
           //     System.out.println(company);
           // }
            //It's way to read collections via Iterator
            Iterator iterator = companyList.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
