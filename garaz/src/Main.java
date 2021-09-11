/**
 * Program realizyjący prostą obsługę garażu wielopoziomowego
 * Samochody w zalażnosci od typu są odpowiednio ustawiane na wolnych miejscach
 * dla pojazdow pow 10 (typ BIGEST) ton przypozadkowane sa miejsca tyko na najnizszym poziomie
 * dla pojazdow do 10 ton (TYP BIG) na drugim i pierwszym poziomie
 * dla pojazdow ponizej 5 ton (TYP NORMAL) trzeci, drugi i pierwszy
 * samochody sa lokowane na miejscach na mozlliwie najwyzszym poziomie
 * program posiada funkcje zwolnienia miejsca postojowego obliczajac (w minutach) przy tym czas postoju pojazdu na danym miejscu
 * v1.0
 * @Paweł Zawada
 */

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

//typ wyliczeniowny na potrzeby okreslenia rodziaju pozazdu
enum CarType {
    NORMAL, //auto < 5 ton
    BIG,    //auto > 5 ton < 10 ton
    BIGEST  //auto >= 10 ton
}

public class Main {
    public static void main(String[] args) {
        //definicja zmiennych do przyechowanie informacji na temat ilosci poziomow, ilosci miejsc na poziomie oraz informacji o zajetym mejscu
        short nLevel,nPlaceinfo;
        int nPlaces;
        CarType carType;

        nLevel = 3; //ustalamy ze parking ma 3 poziomy
        nPlaces = 10; //na kazdym poziomie ustalamy ze jest 10 miejsc
        nPlaceinfo = 3; //ka1zde miejsce ma 3 pola informacyjne
                        // [0]=o  wolne miejsce [0]=x zajete miejsce
                        // [1]  typ pojazdu
                        // [2]  czas przybycia

        int freePlaces = nLevel * nPlaces;  //zmienna przechowuje aktualno ilosc wolych miejsc
                                            //na poczaktu jest to Poziomy * IloscMiejsc

        String[][][] parkingMap = new String[nLevel][nPlaces][nPlaceinfo];

        //wypalniamy mape parkingu wolnymi miejscami
        for (int i = 0; i<nLevel;++i){
            for (int j = 0; j<nPlaces;++j ){
                    parkingMap[i][j][0] = "o";
            }
        }

        Scanner input = new Scanner(System.in);
        int choice = 1;
        carType = CarType.NORMAL;
        //Program działa w pętli do momentu wpisania 0
        while (choice != 0) {

            System.out.printf("(Wolne miejsca: %d) Proszę wybierz operacje:\n",freePlaces);
            System.out.printf("1. NORMAL < 5t%n2. BIG do 10t%n3. BIGEST >= 10t%n4. MAPA%n5. ZWOLNIJ MIEJSCE%n0. Zakończ%n");

            choice = input.nextInt();
            switch (choice) {
                case 1:
                    carType = CarType.NORMAL;
                    break;
                case 2:
                    carType = CarType.BIG;
                    break;
                case 3:
                    carType = CarType.BIGEST;
                    break;
                case 4:
                    //wyswietl parkng
                    for (int i = 0; i < nLevel; ++i) {
                        System.out.printf("Poziom %d\n", i + 1);
                       // System.out.print("\n");
                        for (int j = 0; j < nPlaces; ++j) {
                            if(parkingMap[i][j][0] == "x")
                                System.out.printf("Nr %d->[%s TYPE: %s TIME: %s]  ",j+1, parkingMap[i][j][0], parkingMap[i][j][1],parkingMap[i][j][2]);
                            else
                                System.out.printf("Nr %d->[%s]   ",j+1, parkingMap[i][j][0]);
                        }
                        System.out.print("\n");
                    }
                    break;
                case 5:

                    System.out.print("Podaj nr poziomu od 1 do 3: ");
                    int level = input.nextInt();
                    System.out.print("Podaj nr miejsca: ");
                    int place = input.nextInt();

                    if(parkingMap[level-1][place-1][0] == "x") { //jezel dane miejsce bylo zajete
                        parkingMap[level - 1][place - 1][0] = "o";
                        parkingMap[level - 1][place - 1][1] = "";

                        long minutyPostoju = LocalDateTime.parse(parkingMap[level - 1][place - 1][2]).until(LocalDateTime.now(), ChronoUnit.MINUTES);
                        System.out.printf("Ilość minut postoju: %d\n", minutyPostoju);
                        parkingMap[level - 1][place - 1][2] = "";
                        freePlaces++;
                    }
                    break;
            }
            if (choice == 4 || choice == 0 || choice == 5) continue; //w przypadu wybory mapy pomijamy parkowanie

            boolean isPark = false; //przechowuje informacje czy zaparkowano pojazd

            if (freePlaces > 0) {
                switch (carType) {
                    case NORMAL:
                        isPark = false;
                        //szukamy wolnego miejsca od nawyższego poziomu dla samochodu < 5t
                        for (int i = nLevel - 1; i >= 0; --i) {
                            if (!isPark) {
                                for (int j = 0; j < nPlaces; ++j) {
                                    //sprawdzamy czy dane miejsce jest wolne jezeli tak to wpuszczamy na nie samochod
                                    if (parkingMap[i][j][0] == "o") {
                                        parkingMap[i][j][0] = "x";                              //oznaczamy to miejsce jako zajete
                                        parkingMap[i][j][1] = carType.toString();               //zapsujemy jak to rodzaj samochodu
                                        parkingMap[i][j][2] = LocalDateTime.now().toString();   //zapisujemy czas przyjazdu
                                        isPark = true;
                                        freePlaces--;
                                        break;
                                    } else {
                                        continue;
                                    }
                                }

                                if (isPark == false)
                                    System.out.printf("Brak miejsca do zaparkowania na poziomie: %d\n", i + 1);
                            }

                        }
                        break;
                    case BIG:
                        isPark = false;
                        //szykamy wolnego miejsca od 2 poziomu dla samochodu > 5t <10 t
                        for (int i = nLevel - 2; i >= 0; --i) {
                            if (isPark == false) {
                                for (int j = 0; j < nPlaces; ++j) {
                                    //sprawdzamy czy dane miejsce jest wolne jezeli tak to wpuszczamy na nie samochod
                                    if (parkingMap[i][j][0] == "o") {

                                        parkingMap[i][j][0] = "x";                              //oznaczamy to miejsce jako zajete
                                        parkingMap[i][j][1] = carType.toString();               //zapsujemy jak to rodzaj samochodu
                                        parkingMap[i][j][2] = LocalDateTime.now().toString();   //zapisujemy czas przyjazdu
                                        isPark = true;
                                        freePlaces--;
                                        break;
                                    } else {        //omijamy zajete miejsca
                                        continue;
                                    }
                                }
                                //jezeli nie udalo sie zaparkowac to podajemu komunikat ze brak miejsc
                                if (isPark == false) System.out.println("Brak miejsc !!!\n");
                            }
                        }
                        break;
                    case BIGEST:
                        //szykamy wolnego miejsca na 1 poziomie dla samochodu > 10 t
                        for (int i = 0; i < 1; ++i) {
                            if (isPark == false) {
                                for (int j = 0; j < nPlaces; ++j) {
                                    //sprawdzamy czy dane miejsce jest wolne jezeli tak to wpuszczamy na nie samochod
                                    if (parkingMap[i][j][0] == "o") {

                                        parkingMap[i][j][0] = "x";                              //oznaczamy to miejsce jako zajete
                                        parkingMap[i][j][1] = carType.toString();               //zapsujemy jak to rodzaj samochodu
                                        parkingMap[i][j][2] = LocalDateTime.now().toString();   //zapisujemy czas przyjazdu
                                        isPark = true;
                                        freePlaces--;
                                        break;
                                    } else {
                                        continue;
                                    }

                                }
                                if (isPark == false) System.out.println("Brak miejsc !!!\n");
                            }

                        }
                        break;
                }
            } else {
                System.out.println("Brak wolnych miejsc na parkingu !!!");
            }

        }

    }
}
