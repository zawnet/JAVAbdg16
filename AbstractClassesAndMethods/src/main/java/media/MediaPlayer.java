package media;

import javax.xml.crypto.NoSuchMechanismException;

public interface MediaPlayer {
    String tag = "Media Palyer";        // domyślnie zawiera słowa kluczowe - public static final
    void play();                        // metoda bez zdefiniowanego ciała - domyślnie abstrakcyjna
    void stop();

    default void next(){
        throw new NoSuchMechanismException("not supported by default");
    }

    static String getName(){
        return "MediaPlayer Interface";
    }
}
