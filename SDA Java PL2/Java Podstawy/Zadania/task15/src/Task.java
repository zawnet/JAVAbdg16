import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tu zaimplementuj rozwiązanie

        String txt = scanner.nextLine();
        String[] txt2 = txt.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");


        for(int index=0; index<txt2.length; index++){
            int wordCount = 0;
            for(int index2 = 0; index2< txt2.length;  index2++){
                if(txt2[index].equals(txt2[index2])){
                    wordCount++;
                }
                else {
                    continue;
                }
            }
            System.out.println(txt2[index]+" - "+wordCount);
        }
    }
}