import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Inter1 {
    public Inter1(String inGaz, String inStud){
        List gazety  = new ArrayList();
        Set studenci = new HashSet();

        MColect.makeCollectionFromFile(gazety,inGaz,new Journal() );
        MColect.makeCollectionFromFile(studenci,inStud, new Student());

        MColect.show(gazety);
        MColect.show(studenci);

        //set of minimal release yer
        //previously published newspapers will be deleted
        Journal.setLimitYear(2000);
        MColect.iterRemove(gazety);

        //setting a minimum grade
        //students with minimal grade will be removed from collection
        Student.setLimitMark(3);
        MColect.iterRemove(studenci);
        MColect.show(studenci);
        MColect.show(gazety);
    }

}
