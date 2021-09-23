import java.io.*;

public class Files {
    private FileInputStream in;
    private FileOutputStream out;

    public void  byteCopyFiles(String fileName1, String fileName2){
        try {
            in = new FileInputStream(fileName1);
            out = new FileOutputStream(fileName2);
            int c = 0;
            while((c = in.read()) != -1){
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Plik " + fileName1 + " nie istnieje");
            //e.printStackTrace();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }


}
