import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tu zaimplementuj rozwiązanie
        String txt = scanner.nextLine();
        if(txt.contains("Java")){
            System.out.println("Znalazłem Java");
        }
        if(txt.startsWith("Java")){
            System.out.println("Zaczyna się od Java");
        }
        if(txt.endsWith("Java")){
            System.out.println("Kończy się na Java");
        }
        if(txt.equals("Java")){
            System.out.println("Równa się Java");
        }
        if(txt.indexOf("Java") >=0){
            System.out.println(txt.indexOf("Java"));
        }
    }
}