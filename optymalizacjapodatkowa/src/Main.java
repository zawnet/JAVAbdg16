/*
Program do obliczania optymalizacji podatkowej v 1.0
autor: @Paweł Zawada
sierpien 2021

Program na wejsciu otrzymuje zadaną przez użytkownika kwotę wynagrodzenia brutto
Nstepnie na postawie obowiązyjących na rok 2021 stawek ZUS oraz podatkowych
oblicza skłądki na ubezpieczenia spoleczne, choropowe wypadtkowe zdrowotne oraz kwotę miesięcznego podatku

Nastepnie analizuje tą samą kwotę dla samozastrudnienia prsząc uzytkownika o podanie prognozowanych
kosztów prowadzenia działalnosci gpospodarczej. Nstepnie program przyjmujac jako podstawy do ubezpieczen spolecznych
podstawy minimalne na rok 2021 dla samozadrudnionych oblicza należne składki oraz podatek

Po wykonaniu obliczeń analizuję przy której formie opodatkowania poracownik otrzyma wiecej wynagrodzenia netto.
 */

import java.util.Scanner;


import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        double scale = Math.pow(10, 2);                 //do zaokroglania dwo 2 miejsc

        double wynagrodzenieBruttoMsc = 0.00d;          // kwota miesięcznego wynagrodzenia brutto
        double wynagrodzenieBruttoRok = 0.00d;           // kwota rocznego wynagrodzenia brutto
        double kwotaWolnaOdPodatku = 8000.00d;          // kwota wolna od podatku w 2021 roku

        double wynagrodzenieNettoMsc = 0.00d;
        double wynagrodzenieNettoRok = 0.00d;
        //potracenia na ubezpieczenia spoleczne z tytulu umowy o prace
        double  podstawaSpoleczne           = 0.00d;    // podstawa wynagrodznia do liczenia skladek na ubez spoleczne
        double  podstawaSpoleczneRok        = 0.00d;    //podstawa spoleczne na rok
        double  skladkiUbezpieceniaSpoleczne;           // suma składek na ubezpieczenia społeczne
        double  skladkiUbezpieceniaSpoleczneRok;
        float   pSklEmerytalnaPoracownik    =0.0976f;   // % składki emerytalnej potracanej pracownikowi     (9,76%)
        float   pSklEmerytalnaPracodawca    =0.0976f;   // % składki emerytalnej płaconej przez pracodawce   (9,76%)
        float   pSklRentowaPracownik        =0.0150f;   // % składki rentowej potracanej pracownikowi        (1,5%)
        float   pSklRentowaPraacodawca      =0.0650f;   // % składki rentowej placonej przez pracodawce      (6,5%)
        float   pSklChorobowa               =0.0245f;   // % składki chorobowej potracanej pracownikowi      (2,45%)
        float   pSklWypadkowaPracodawca     =0.0167f;   // % składki wypadkowej placonej przez pracodawce    (1,67%)
        double  sklEmerytalnaPoracownik;                // kwota składki emerytalnej potracanej pracownikowi
        double  sklEmerytalnaPoracownikRok;             //roczna kwota składki emerytalnej potracanej pracownikowi
        double  sklEmerytalnaPracodawca;                // kwota składki emerytalnej płaconej przez pracodawce
        double  sklRentowaPracownik;                    // kwota składki rentowej potracanej pracownikowi
        double  sklRentowaPracownikRok;
        double  sklRentowaPraacodawca;                  // kwota składki rentowej placonej przez pracodawce
        double  sklChorobowa;                           // kwota składki chorobowej potracanej pracownikowi
        double  sklChorobowaRok;
        double  sklWypadkowaPracodawca;                 // kwota składki wypadkowej placonej przez pracodawce
        //potracenia z tytulu ubezpieczenia zdrowotnego
        double  podstawaZdrowotne           = 0.00d;    // podstawa do obliczenien skladki na ubezpieczenie zdrowotne
        double  podstawaZdrowotneRok;
        float   pSklZdrowotna               =0.09f;      // % skladnki na ubezpieczenie zdrowotne (9%)
        float   pSklZdrowotnaPdk            =0.0775f;     // % skladnki na ubezpieczenie zdrowotne odliczanej od podatku (7,75%)
        double  sklZdrowotna;                           // kwota skladnki na ubezpieczenie zdrowotne (9%)
        double  sklZdrowotnaPdk;
        double  sklZdrowotnaRok;                           // kwota skladnki na ubezpieczenie zdrowotne (9%)
        double  sklZdrowotnaPdkRok;
        //koszty koszty uzyskania przychodu
        float   kosztyUzyskaniaRoczny        =3000.00f;   //kwota rocznych kosztow uzyskania przychodu dla umowy o pracę
        float   kosztyUzyskaniaMiesieczny    =kosztyUzyskaniaRoczny/12;
        //Podatek dochodowy wg skali podatkowej
        double  podstawaPodatek              =0f;        //podstawa obliczenia zaliczki na podatek dochodowy, po zaokrągleniu do pełnych złotych
        double  podstawaPodatekMsc              =0f;
        float   pPodatekSt17                 =0.17f;     // 17% podatku od postawy obliczany na podstawie osiagnietego przychodu do podatkowania
        float   pPodatekSt32                 =0.32f;     // 32% podatku od postawy obliczany na podstawie osiagnietego przychodu do podatkowania
        float   progSt17                    =85528;
        //float   progSt32                    =
        float   kwotaZmniejszajacaPD        =0.00f;     //kwota zmniejszajaca wysokosc podatku oblaczana wedlg schematu
        float   kwotaZmniejszajacaPDMsc;
        double  kwotaPodatku;
        double  kwotaPodatkuMsc;
        //obliczanie podatku
        System.out.println("Podaj proszę kwotę miesiecznego wynagrodzenia brutto: ");
        Scanner input = new Scanner(System.in);
        wynagrodzenieBruttoMsc = input.nextDouble();
        //wynagrodzenieBruttoMsc = 10000;
        wynagrodzenieBruttoRok = wynagrodzenieBruttoMsc*12;
        System.out.printf("Obliczenia dla kwoty: %.2f\n", wynagrodzenieBruttoMsc);
        //obliczanie kwot skladek na ubezpieczenia spoleczne za 1 miesic
        podstawaSpoleczne               = wynagrodzenieBruttoMsc;
        podstawaSpoleczneRok            = wynagrodzenieBruttoRok;
        //obliczanie skladki eerytalnej
        sklEmerytalnaPoracownik         = podstawaSpoleczne*pSklEmerytalnaPoracownik;
        sklEmerytalnaPoracownikRok      = podstawaSpoleczneRok*pSklEmerytalnaPoracownik;
        //obliczanie skladki rentowej
        sklRentowaPracownik             = podstawaSpoleczne*pSklRentowaPracownik;
        sklRentowaPracownikRok          = podstawaSpoleczneRok*pSklRentowaPracownik;
        //obliczanie skladki chorobowej
        sklChorobowa                    = podstawaSpoleczne*pSklChorobowa;
        sklChorobowaRok                 = podstawaSpoleczneRok*pSklChorobowa;
        //suma skladek na ubez. spoleczne
        skladkiUbezpieceniaSpoleczne    = sklEmerytalnaPoracownik+sklRentowaPracownik+sklChorobowa;
        skladkiUbezpieceniaSpoleczne    = round(skladkiUbezpieceniaSpoleczne * scale) / scale;
        skladkiUbezpieceniaSpoleczneRok = sklEmerytalnaPoracownikRok+sklRentowaPracownikRok+sklChorobowaRok;
        //skladkiUbezpieceniaSpoleczneRok = skladkiUbezpieceniaSpoleczne*12;
        //System.out.printf("spol mies: %.2f  spol rok: %.2f\n" ,skladkiUbezpieceniaSpoleczne, skladkiUbezpieceniaSpoleczneRok);

        podstawaZdrowotne               = wynagrodzenieBruttoMsc - skladkiUbezpieceniaSpoleczne;
        podstawaZdrowotneRok            = wynagrodzenieBruttoRok -skladkiUbezpieceniaSpoleczneRok;
        //System.out.printf("Roczna podstawa składki zdrowotnej to: %.2f\n", podstawaZdrowotneRok);
        sklZdrowotna = podstawaZdrowotne*pSklZdrowotna;
        sklZdrowotnaRok = podstawaZdrowotneRok*pSklZdrowotna;
        //System.out.printf("Roczna kwota składki zdrowotnej to: %.2f\n", sklZdrowotnaRok);
        sklZdrowotnaPdk = round((podstawaZdrowotne*pSklZdrowotnaPdk)*scale)/scale;
        sklZdrowotnaPdkRok = round((podstawaZdrowotneRok*pSklZdrowotnaPdk)*scale)/scale;

        //System.out.println(sklZdrowotnaPdk);
        //System.out.println(podstawaZdrowotne);
        //Obliczenie podstawy do opdatkowania roczneego
        podstawaPodatek     = round(wynagrodzenieBruttoRok-skladkiUbezpieceniaSpoleczneRok-kosztyUzyskaniaRoczny);
        //Obliczefnie podstawy do opodatkowania miesiecznej
        podstawaPodatekMsc  = round(wynagrodzenieBruttoMsc-skladkiUbezpieceniaSpoleczne-kosztyUzyskaniaMiesieczny);
        //System.out.println(podstawaPodatekMsc);
        //wyliczenie kwoty odliczenia od podatku
        if(podstawaPodatek <=8000) {
            kwotaZmniejszajacaPD = 1360;
        }
        else if(podstawaPodatek > 8000 && podstawaPodatek <=13000){
            kwotaZmniejszajacaPD = (float)(1360 - ((834.88*(podstawaPodatek-8000))/5000));
        }
        else if(podstawaPodatek >13000 && podstawaPodatek <=85528){
            kwotaZmniejszajacaPD = 525.12f;
        }
        else if(podstawaPodatek >85528 && podstawaPodatek<=127000){
            kwotaZmniejszajacaPD = (float)(525.12 - ((834.88*(podstawaPodatek-85528))/41472));
        }
        else {
            kwotaZmniejszajacaPD = 0;
        }
        kwotaZmniejszajacaPDMsc = kwotaZmniejszajacaPD/12;
        kwotaZmniejszajacaPDMsc = (float) (round(kwotaZmniejszajacaPDMsc*scale)/scale);
        //System.out.println(kwotaZmniejszajacaPDMsc);
        //obliczenie podatku
        if(podstawaPodatek <= progSt17){
            kwotaPodatku = (podstawaPodatek*pPodatekSt17)-kwotaZmniejszajacaPD;
        }
        else {
            kwotaPodatku = (podstawaPodatek*pPodatekSt17)+(pPodatekSt32*(podstawaPodatek-progSt17)-kwotaZmniejszajacaPD);
        }
        kwotaPodatkuMsc = round(((kwotaPodatku/12)*scale))/scale;
        //zaokraglenie do pelnych zl
        kwotaPodatkuMsc = round(kwotaPodatkuMsc-sklZdrowotnaPdk);
        kwotaPodatku = kwotaPodatku - sklZdrowotnaPdkRok;
        //System.out.printf("Podatek msc: %.2f Podatek rok: %.2f\n",kwotaPodatkuMsc, kwotaPodatku);


        wynagrodzenieNettoMsc = wynagrodzenieBruttoMsc - skladkiUbezpieceniaSpoleczne - sklZdrowotna - kwotaPodatkuMsc;
        wynagrodzenieNettoMsc = round(wynagrodzenieNettoMsc*scale)/scale;

        wynagrodzenieNettoRok = wynagrodzenieBruttoRok - skladkiUbezpieceniaSpoleczneRok - sklZdrowotnaRok - kwotaPodatku;
        //System.out.printf("Wynagrodzienie roczne z %.2f brutto to -> netto/Rok: %.2f\n",wynagrodzenieBruttoRok, wynagrodzenieNettoRok);
        //System.out.printf("Wynagrodzienie miesieczne z %.2f brutto to -> netto/msc: %.2f\n",wynagrodzenieBruttoMsc, wynagrodzenieNettoMsc);
        //System.out.printf("Ubezpieczenia społeczne: %.2f Ubezpieczenie zdrowotne: %.2f Podatek dochodowy: %.2f\n", skladkiUbezpieceniaSpoleczneRok, sklZdrowotnaRok, kwotaPodatku);
        System.out.printf("Umowa o prace  ZUS społ: %.2f  zdrowotne: %.2f  Razem ZUS: %.2f  Podatek: %.2f  Netto: %.2f\n",skladkiUbezpieceniaSpoleczne,sklZdrowotna, skladkiUbezpieceniaSpoleczne+sklZdrowotna, kwotaPodatkuMsc, wynagrodzenieNettoMsc);

        //JDG Samozatridnienie zasady ogólne
        double podstawaSpoleczneJDGMsc = 3155.40d;
        //podstawaSpoleczneJDGMsc = wynagrodzenieBruttoMsc;
        double podstawaZdrowotneJDGMsc = 4242.38;
        double  skladkiUbezpieceniaSpoleczneJDG;           // suma składek na ubezpieczenia społeczne
        double  skladkiUbezpieceniaSpoleczneJDGRok;
        float   pSklEmerytalnaJdg = 0.1952f;
        double  sklEmerytalnaJdg;
        double  sklEmerytalnaJdgRok;
        float   psklRenotowaJDG = 0.08f;
        double  sklRenotowaJdg;
        double  sklRentowaJdgRok;
        double  sklChorobowaJdg;
        float   pSklChorobowaJdg = 0.0245f;
        double  sklChorobowaJdgRok;
        float   pSklWypadtkowaJdg = 0.0167f;
        double  sklWypadtkowaJdg;
        double  sklWypadtkowaJdgRok;
        float   pSklFPiFSJDG = 0.0245f;
        double   sklFPiFSJDG;
        float   sklFPiFSJDGRok;
        float   pSklZdrowotnaJdg = 0.09f;
        double  sklZdrowotnaJdg;
        float   psklZdrowotnaJdkPdk = 0.075f;
        double  sklZdrowotnaJdkPdk;
        double  sklZdrowotnaJdgROk;

        double  kosztyUzyskaniaJdg = 250;
        System.out.println("Pproszę podaj kwotę miesięcznych kosztów w działalnosci gospodarczej");
        kosztyUzyskaniaJdg = input.nextDouble();
        double  podstawaPodatekJdg;
        double  kwotaPodatkuJdg;
        double  kwotaPodatkuJdgMsc;
        double  wynagrodzenieNettoJdgMsc;

        sklEmerytalnaJdg    = podstawaSpoleczneJDGMsc*pSklEmerytalnaJdg;
        sklRenotowaJdg      = podstawaSpoleczneJDGMsc*psklRenotowaJDG;
        sklWypadtkowaJdg    = podstawaSpoleczneJDGMsc*pSklWypadtkowaJdg;
        sklChorobowaJdg     = podstawaSpoleczneJDGMsc*pSklChorobowaJdg;
        sklFPiFSJDG         = podstawaSpoleczneJDGMsc*pSklFPiFSJDG;

        skladkiUbezpieceniaSpoleczneJDG=sklEmerytalnaJdg+sklRenotowaJdg+sklWypadtkowaJdg+sklChorobowaJdg+sklFPiFSJDG;

        sklZdrowotnaJdg     = podstawaZdrowotneJDGMsc*pSklZdrowotnaJdg;
        sklZdrowotnaJdkPdk  = podstawaZdrowotneJDGMsc*psklZdrowotnaJdkPdk;


        podstawaPodatekJdg     = round(wynagrodzenieBruttoMsc-skladkiUbezpieceniaSpoleczneJDG-kosztyUzyskaniaJdg)*12;

        if(podstawaPodatekJdg <=8000) {
            kwotaZmniejszajacaPD = 1360;
        }
        else if(podstawaPodatekJdg > 8000 && podstawaPodatekJdg <=13000){
            kwotaZmniejszajacaPD = (float)(1360 - ((834.88*(podstawaPodatek-8000))/5000));
        }
        else if(podstawaPodatekJdg >13000 && podstawaPodatekJdg <=85528){
            kwotaZmniejszajacaPD = 525.12f;
        }
        else if(podstawaPodatekJdg >85528 && podstawaPodatekJdg<=127000){
            kwotaZmniejszajacaPD = (float)(525.12 - ((834.88*(podstawaPodatek-85528))/41472));
        }
        else {
            kwotaZmniejszajacaPD = 0;
        }
        kwotaZmniejszajacaPDMsc = kwotaZmniejszajacaPD/12;
        kwotaZmniejszajacaPDMsc = (float) (round(kwotaZmniejszajacaPDMsc*scale)/scale);
        //System.out.println(kwotaZmniejszajacaPDMsc);
        //obliczenie podatku
        //podstawaPodatekJdg = podstawaPodatekJdg*12;
        if(podstawaPodatekJdg <= progSt17){
            kwotaPodatkuJdg = (podstawaPodatekJdg*pPodatekSt17)-kwotaZmniejszajacaPD;
        }
        else {
            kwotaPodatkuJdg = (podstawaPodatekJdg*pPodatekSt17)+(pPodatekSt32*(podstawaPodatekJdg-progSt17)-kwotaZmniejszajacaPD);
        }
        kwotaPodatkuJdgMsc = round(((kwotaPodatkuJdg/12)*scale))/scale;
        //zaokraglenie do pelnych zl
        kwotaPodatkuJdgMsc = round(kwotaPodatkuJdgMsc-sklZdrowotnaJdkPdk);
        if(kwotaPodatkuJdgMsc < 0)
            kwotaPodatkuJdgMsc = 0;
        wynagrodzenieNettoJdgMsc = wynagrodzenieBruttoMsc - skladkiUbezpieceniaSpoleczneJDG - sklZdrowotnaJdg - kwotaPodatkuJdgMsc;
        System.out.printf("Samozatrudnienie zasady ogólne ZUS społ: %.2f  zdrowotne: %.2f  Razem ZUS: %.2f  Podatek: %.2f  Netto: %.2f\n",skladkiUbezpieceniaSpoleczneJDG,sklZdrowotnaJdg, skladkiUbezpieceniaSpoleczneJDG+sklZdrowotnaJdg, kwotaPodatkuJdgMsc, wynagrodzenieNettoJdgMsc);

        //obliczenie podatku JDG liniowy
        double  podstawaPodatekJdgL;
        float   pPodatekSt19 = 0.19f;
        double  kwotaPodatkuJdgL;
        double  wynagrodzenieNettoJdgMscL;

        podstawaPodatekJdgL     = round(wynagrodzenieBruttoMsc-skladkiUbezpieceniaSpoleczneJDG-kosztyUzyskaniaJdg);
        kwotaPodatkuJdgL       = podstawaPodatekJdgL *pPodatekSt19;
        if(kwotaPodatkuJdgL < sklZdrowotnaJdg)
            kwotaPodatkuJdgL = 0;
        else
            kwotaPodatkuJdgL   = kwotaPodatkuJdgL - sklZdrowotnaJdkPdk;


        wynagrodzenieNettoJdgMscL = wynagrodzenieBruttoMsc - skladkiUbezpieceniaSpoleczneJDG - sklZdrowotnaJdg - kwotaPodatkuJdgL;
        System.out.printf("Samozatrudnienie podatek liniowy ZUS społ: %.2f  zdrowotne: %.2f  Razem ZUS: %.2f  Podatek: %.2f  Netto: %.2f\n",skladkiUbezpieceniaSpoleczneJDG,sklZdrowotnaJdg, skladkiUbezpieceniaSpoleczneJDG+sklZdrowotnaJdg, kwotaPodatkuJdgL, wynagrodzenieNettoJdgMscL);


        if(wynagrodzenieNettoMsc > wynagrodzenieNettoJdgMsc &&  wynagrodzenieNettoMsc > wynagrodzenieNettoJdgMscL){
            System.out.println("Pozostan przy umowie o prace");
        }
        else if(wynagrodzenieNettoJdgMsc > wynagrodzenieNettoJdgMscL){
            System.out.println("Wiecej dostaniesz z samozadrudnienia na zasadach ogólnych.");
        }
        else {
            System.out.println("Wiecej dostaniesz z samozadrudnienia na podatku liniowym");
        }
    }
}
