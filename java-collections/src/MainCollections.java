import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainCollections {
    public static void main(String[] args) {
        String tes = "WALID";
        String reversedString = new StringBuilder(tes).reverse().toString();
        System.out.println(getXO("Xxxxertr34"));
    }

    public static boolean getXO(String str) {

        long nbo = str.chars().filter(e -> Character.toLowerCase(e) == 'o').count();
        long nbx = str.chars().filter(e -> Character.toLowerCase(e) == 'x').count();
        return (nbo == 0 && nbx == 0) || nbx == nbo;
    }

    private static void Maps() {
        Logger log = Logger.getLogger(MainCollections.class.getName());

        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(2, "dredte");
        hashmap.put(2, "dddffdf");
        hashmap.entrySet().stream().forEach(e -> log.log(Level.INFO, "" + e.getKey() + "------" + e.getValue()));
        Iterator<Map.Entry<Integer, String>> it = hashmap.entrySet().iterator();
        while (it.hasNext()) {
            log.log(Level.INFO, it.next().getValue());
        }
    }

    private static void EterateList(Iterator it, Logger log) {

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
        while (it.hasNext()) {
            log.log(Level.INFO, it.next().toString());
        }
    }
}
