import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static String kod_waluty[] ;
    public static String kurs_sredni[] ;

    public static void main(String[] args) {

        //Zmienna na potrzeby przechowywania informacji o dacie publikacji
        String data_publikacji = "";

        //Pobranie kursow walut
        try {

            //Definjujemy adres do xml-a z kursami
            URL url = new URL("https://www.nbp.pl/kursy/xml/lasta.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            //Pobieramy dokument xml
            Document doc = db.parse(new InputSource(url.openStream()));
            doc.getDocumentElement().normalize();
            //odczytujemy date publikacji
            data_publikacji = doc.getElementsByTagName("data_publikacji").item(0).getFirstChild().getNodeValue();

            //Pobieremy liste z wszytkimi pozycjami
            NodeList nodeList = doc.getElementsByTagName("pozycja");

            //inicjalizacja tablic ma potrzeby przyechowywania kodow walut i kursow srednich
            kod_waluty = new String[nodeList.getLength()];
            kurs_sredni = new String[nodeList.getLength()];
            
            for (int i = 0; i < nodeList.getLength(); i++) {

                Node node = nodeList.item(i);
                Element kodElmnt = (Element) node;
                NodeList kodList = kodElmnt.getElementsByTagName("kod_waluty");
                Element kodElement = (Element) kodList.item(0);
                kodList = kodElement.getChildNodes();
                //wstawienie wartosci z kodem waluty do tablicy przechowujacej kody walut
                kod_waluty[i] = (((Node) kodList.item(0)).getNodeValue());

                Element kursElmnt = (Element) node;
                NodeList kursList = kursElmnt.getElementsByTagName("kurs_sredni");
                Element kursElement = (Element) kursList.item(0);
                kursList = kursElement.getChildNodes();

                //wstawienie wartosci kursu sredniedo do tablicy przechowujacej kursy srednie
                kurs_sredni[i] = (((Node) kursList.item(0)).getNodeValue());
            }
            System.out.println("Kursy walut zostały pobrane poprawnie.");
        } catch (Exception e) {
            System.out.println("Błąd podczas pobierania kursów walut");
        }

        Scanner input = new Scanner(System.in);
        int choice = 0;

        //Program działa w pętli do momentu wpisania 5
        while (choice != 5) {
        System.out.println("Proszę o podanie waluty do przeliczenia:");
        System.out.printf("1. PLN -> USD%n2. PLN -> EUR%n3. USD -> PLN%n4. EUR -> PLN%n5. Zakończ%n");

            choice = input.nextInt();
            float course;
            String kodWaluty;
            switch (choice) {
                case 1:
                    kodWaluty = "USD";
                    course = 1 / PobierzKursWaluty(kodWaluty);
                    System.out.printf("kurs wymiany z dnia: %s  wynosi 1PLN = %f %s\n", data_publikacji, course, kodWaluty);
                    System.out.print("Podaj ile masz PLN do wymiany: ");
                    double money1 = input.nextDouble();
                    System.out.printf("Po wymianie będziesz mieć: %.2f %s\n", money1 * course, kodWaluty);
                    break;
                case 2:
                    kodWaluty = "EUR";
                    course = 1 / PobierzKursWaluty("EUR");
                    System.out.printf("kurs wymiany z dnia: %s wynosi 1PLN = %f %S\n", data_publikacji, course, kodWaluty);
                    System.out.print("Podaj ile masz PLN do wymiany: ");
                    double money2 = input.nextDouble();
                    System.out.printf("Po wymianie będziesz mieć: %.2f %s\n", money2 * course, kodWaluty);
                    break;
                case 3:
                    kodWaluty = "USD";
                    course = PobierzKursWaluty(kodWaluty);
                    System.out.printf("kurs wymiany z dnia: %s wynosi 1%s = %f $\n", data_publikacji, kodWaluty, course);
                    System.out.printf("Podaj ile masz %s do wymiany: ", kodWaluty);
                    double money3 = input.nextDouble();
                    System.out.printf("Po wymianie będziesz mieć: %.2f PLN\n", money3 * course);
                    break;
                case 4:
                    kodWaluty = "EUR";
                    course = PobierzKursWaluty(kodWaluty);
                    System.out.printf("kurs wymiany z dnia: %s wynosi 1%s = %f E\n", data_publikacji, kodWaluty, course);
                    System.out.printf("Podaj ile masz %s do wymiany: ", kodWaluty);
                    double money4 = input.nextDouble();
                    System.out.printf("Po wymianie będziesz mieć: %.2f PLN\n", money4 * course);
                    break;
                case 5:
                    System.out.println("Dziękujey za skorzystanie z naszego przelicznika.");
                    System.out.println("Do widzenia");
                    System.exit(0);
                default:
                    System.out.println("Niewłaściwy wybór, proszę spróbować ponownie.");
                    //continue begin;
            }
        }
    }
    public static float PobierzKursWaluty(String Wal) {
        {

            for(int i=0;i<kod_waluty.length;i++)
            {
                if(kod_waluty[i].contains(Wal)){
                    return Float.parseFloat(kurs_sredni[i].replace(',','.'));
                }
                else {
                    continue;
                }
            }
            return 0;

        }
    }
}