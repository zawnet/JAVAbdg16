package Machines;

import java.time.Duration;

public interface MicrowaveOven {
    void start();

    void setDuration(int durationInSeconds);

    boolean isFinished();

    void setPower(int power);

    /**
     * Metoda domyślna interfejsu zwracająca Nazwę urządzenia
     * Klasy, które implementują interfejs, mogą nadpisac tą metodę
     * @return
     */
    default String getName(){
        return "MicrovaweOwen";
    }

    /**
     * Metoda domyślna w interfejsie zwracajaca rekomendowany czas dla odmrażania
     * potrawy o podanej wadze
     * @param foodWeightInGrams
     * @return
     */
    default Duration getRedommendedDefrostTime(double foodWeightInGrams){
        double frostRate = 0.8;
        int power = 300;
        return getRecomendedTime(power, frostRate, foodWeightInGrams);
    }

    /**
     * Metoda domyślna w interfejsie zwracajaca rekomendowany czas podgrzeania potrawy
     * o podanej wadze
     * @param foodWeightInGrams
     * @return
     */
    default Duration getRecommendedWarmingUpTime(double foodWeightInGrams){
        double frostRate = 0.2;
        int power = 700;
        return getRecomendedTime(power, frostRate, foodWeightInGrams);
    }

    /**
     * Prywatna metoda interfejsu używana wyłącznie na potrzeby metod domyślnych
     * ponieważ tylko metoda domyślna moż posiadać implementaację oraz metoda prywanta używana w
     * ciele metody domyślnej
     * Metody prywatne w interfejsach pozwalają na usunięcie kodu, który powtarza się w wielu miejscach.
     * Ten powtarzający się kod jest wówczas zawarty w ciele metody prywatnej.
     * @param power
     * @param frostRate
     * @param foodWeightInGrams
     * @return
     */
    private Duration getRecomendedTime(int power, double frostRate, double foodWeightInGrams){
        double durationInMinutes = foodWeightInGrams / ((1 - frostRate) *power);
        long durationInSeconds = (long) (durationInMinutes * 60);
        return  Duration.ofSeconds(durationInSeconds);
    }

}
