import java.util.Collection;

public interface CollectionHelper {
    //Make object from String text and  add to c collection
    void makeObjectAndCollect(String s, Collection c);
    //Return true if object should be removed from collection
    boolean isReadyToRemove();
}
