import java.io.FileOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

class Currency {
    public String name;
    public String code;
    public float exchangeRate;
    public int convertRate;
}


public class Main {
    public static void main(String[] args) {
        List<Currency> currencyList = new ArrayList<>();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Currency zloty = new Currency();
        zloty.name = "Złoty";
        zloty.code = "PLN";
        zloty.exchangeRate = 1;
        zloty.convertRate = 1;
        currencyList.add(zloty);
        try{
            URL website = new URL("https://www.nbp.pl/kursy/xml/lasta.xml");
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream("Currency.xml");
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("Currency.xml"));
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("pozycja");

            for (int i = 0; i < nodeList.getLength(); i++){
                Node node = nodeList.item(i);

                Element nameElmnt = (Element) node;
                NodeList nameList = nameElmnt.getElementsByTagName("nazwa_waluty");
                Element nameElement = (Element) nameList.item(0);
                nameList = nameElement.getChildNodes();

                Element codeElmnt = (Element) node;
                NodeList codeList = codeElmnt.getElementsByTagName("kod_waluty");
                Element codeElement = (Element) codeList.item(0);
                codeList = codeElement.getChildNodes();

                Element exchangeRateElmnt = (Element) node;
                NodeList exchangeRateList = exchangeRateElmnt.getElementsByTagName("kurs_sredni");
                Element exchangeRateElement = (Element) exchangeRateList.item(0);
                exchangeRateList = exchangeRateElement.getChildNodes();

                Element convertRateElmnt = (Element) node;
                NodeList convertRateList = convertRateElmnt.getElementsByTagName("przelicznik");
                Element convertRateElement = (Element) convertRateList.item(0);
                convertRateList = convertRateElement.getChildNodes();

                Currency currency = new Currency();
                currency.name = (((Node) nameList.item(0)).getNodeValue());
                currency.code = (((Node) codeList.item(0)).getNodeValue());
                currency.exchangeRate = Float.parseFloat(((Node) exchangeRateList.item(0)).getNodeValue().replace(',','.'));
                currency.convertRate = Integer.parseInt(((Node) convertRateList.item(0)).getNodeValue());
                currencyList.add(currency);
            }


            System.out.println("Kursy walut zostały pobrane poprawnie.");
        } catch (Exception e){
            System.out.println("Błąd podczas pobierania kursów walut");
        }

        Scanner input = new Scanner(System.in);
        int menu = 0;
        Currency currencyToBuy;
        Currency currencyToSell;
        String currencyToBuyCode;
        String currencyToSellCode;
        float sellQuantity;
        float result;
        while (menu != 4){
            System.out.println("\n1. Zakup waluty\n2. Sprzedaż waluty\n3. Wymiana między walutami\n4. Wyjście");
            menu = input.nextInt();
            switch(menu){
                case 1:
                    for (Currency currency: currencyList) {
                        System.out.printf("%s %s\n",currency.code,currency.name);
                    }
                    System.out.printf("Wpisz trzy literowy kod waluty którą chcesz kupić\n");
                    currencyToBuyCode = input.next();
                    String finalCurrencyToBuyCode = currencyToBuyCode;
                    currencyToBuy = currencyList.stream().filter(c -> finalCurrencyToBuyCode.equals(c.code)).findFirst().orElse(null);
                    if (currencyToBuy == null) {
                        System.out.println("Błędny kod waluty");
                        break;
                    }
                    System.out.printf("Za ile PLN chcesz kupić %s:",currencyToBuy.code);
                    float buyQuantity = input.nextFloat();
                    result = buyQuantity/(currencyToBuy.exchangeRate * currencyToBuy.convertRate);
                    //result = Math.round(result*4)/4;
                    System.out.printf("\n%f PLN = %.4f %s",buyQuantity,result,currencyToBuy.code);
                    break;
                case 2:
                    for (Currency currency: currencyList) {
                        System.out.printf("%s %s\n",currency.code,currency.name);
                    }
                    System.out.printf("Wpisz trzy literowy kod waluty którą chcesz sprzedać\n");
                    currencyToSellCode = input.next();
                    String finalCurrencyToSellCode = currencyToSellCode;
                    currencyToSell = currencyList.stream().filter(c -> finalCurrencyToSellCode.equals(c.code)).findFirst().orElse(null);
                    if (currencyToSell == null) {
                        System.out.println("Błędny kod waluty");
                        break;
                    }
                    System.out.printf("Ile %s chesz sprzedać:",currencyToSell.code);
                    sellQuantity = input.nextFloat();
                    result = sellQuantity*currencyToSell.exchangeRate/currencyToSell.convertRate;
                    result = Math.round(result);
                    System.out.printf("\n%f %s = %f PLN",sellQuantity,currencyToSell.code,result);
                    break;
                case 3:
                    for (Currency currency: currencyList) {
                        System.out.printf("%s %s\n", currency.code, currency.name);
                    }
                    System.out.printf("Wpisz trzy literowy kod waluty którą chcesz sprzedać");
                    currencyToSellCode = input.next();
                    String finalCurrencyToSellCode1 = currencyToSellCode;
                    currencyToSell = currencyList.stream().filter(c -> finalCurrencyToSellCode1.equals(c.code)).findFirst().orElse(null);
                    System.out.printf("Wpisz trzy literowy kod waluty którą chcesz kupić");
                    currencyToBuyCode = input.next();
                    String finalCurrencyToBuyCode1 = currencyToBuyCode;
                    currencyToBuy = currencyList.stream().filter(c -> finalCurrencyToBuyCode1.equals(c.code)).findFirst().orElse(null);
                    System.out.printf("Ile %s chesz sprzedać:",currencyToSell.code);
                    sellQuantity = input.nextFloat();
                    result = (sellQuantity*currencyToSell.exchangeRate/currencyToSell.convertRate)/currencyToBuy.exchangeRate*currencyToBuy.convertRate;
                    //result = Math.round(result);
                    System.out.printf("\n%f %s = %f %s",sellQuantity,currencyToSell.code,result,currencyToBuy.code);
                case 4:
                    System.out.println("Do zobaczenia");
                    break;
                default:
                    System.out.println("Wybierz poprawną opcję");
                    break;
            }
        }
    }
}