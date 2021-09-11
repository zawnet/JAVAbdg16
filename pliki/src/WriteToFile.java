import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {

        try {
            FileWriter myWriter= new FileWriter("filename.txt");
            myWriter.write("Treść pliku! 212vfdsdsdf sdfdsfdsfsdfdsfdsdfdsf dsds fsd ffsdfdsfs12");
            myWriter.close();
            System.out.println("Plik zapisany");
        }
        catch (IOException e){
            System.out.println("Błąd");
            e.printStackTrace();
        }
    }
}
