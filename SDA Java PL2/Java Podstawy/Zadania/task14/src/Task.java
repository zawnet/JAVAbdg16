import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tu zaimplementuj rozwiązanie
        String txt = scanner.nextLine();
        String txt2 = txt.replaceAll(",","-MAKARENA");
        System.out.println(txt2);

    }
}