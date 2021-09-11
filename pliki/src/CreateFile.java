import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try{
            File myObj = new File("files//filename.txt");
            if (myObj.createNewFile()){
                System.out.println("File created: "+ myObj.getAbsolutePath());
            }
            else {
                System.out.println("File alredy exists."+myObj.getAbsolutePath());
            }
        }catch (IOException e){
            System.out.println("AN error occurred.");
            e.printStackTrace();
        }
    }

}
