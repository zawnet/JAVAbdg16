import java.util.Collection;
import java.util.Objects;
import java.util.StringTokenizer;

public class Student implements CollectionHelper, Comparable{
    private String name;
    private double mark;
    private static double minMark; //minimal mark


    public Student() { }

    public Student(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public void makeObjectAndCollect(String s, Collection c) {
        StringTokenizer stringTokenizer = new StringTokenizer(s,"\"");
        String name = "", txt = "";
        double mark = 0.0d;
      //  while (stringTokenizer.hasMoreTokens()){
        try {
                name = stringTokenizer.nextToken();
                mark = Double.parseDouble(stringTokenizer.nextToken().trim());
        }
        catch (NumberFormatException e){
                name += txt+ " ";
            }
       // }
        Student student = new Student(name,mark);
        c.add(student);
    }

    @Override
    public boolean isReadyToRemove() {
        return mark<minMark;
    }

    @Override
    public int compareTo(Object o) {
        return name.compareTo((String) o);
    }
    public static void setLimitMark(int i) {
        minMark = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.mark, mark) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
