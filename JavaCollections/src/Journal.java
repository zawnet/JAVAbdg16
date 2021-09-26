import java.util.Collection;
import java.util.StringTokenizer;

public class Journal implements CollectionHelper, Comparable {
    private String title;
    private int year;

    //the year from which to leave the newspapers
    private  static int retailAfter = 0;

    public Journal(){ }

    public Journal(String title, int year) {
        this.title = title;
        this.year = year;
    }

    /**
     * Make Jurnal object from string witch title is between "" in file
     * after title is publication year
     * Add s to collection c
     * @param s
     * @param c
     */
    @Override
    public void makeObjectAndCollect(String s, Collection c) {
        String title = "";
        int year = -1;
        try{
            StringTokenizer stringTokenizer = new StringTokenizer(s,"\"");
            title = stringTokenizer.nextToken();
            year = Integer.parseInt(stringTokenizer.nextToken().trim());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        Journal j = new Journal(title,year);
        c.add(j);
    }

    public static void setLimitYear(int i) {
        retailAfter = i;
    }

    @Override
    public boolean isReadyToRemove() {
        return year < retailAfter;
    }

    @Override
    public int compareTo(Object o) {
        return title.compareTo((String) o);
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    @Override
    public String toString() {
        return title + " " + year;
    }
}
