import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainCollections {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(MainCollections.class.getName());

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("first");
        linkedList.addFirst("second");
        linkedList.addFirst("third");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third");
        arrayList.remove(arrayList.get(0));
        arrayList.stream().forEach((e) -> log.log(Level.INFO, e));
    }

    private static void EterateList(Iterator it, Logger log) {
        while (it.hasNext()) {
            log.log(Level.INFO, it.next().toString());
        }
    }
}
