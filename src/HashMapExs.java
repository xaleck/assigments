import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExs {
    
    public static void main(String[] args) {
        HashMap<String, Integer> originalMap = new HashMap<>();
        originalMap.put("Apple", 3);
        originalMap.put("Banana", 5);
        originalMap.put("Cherry", 7);
        originalMap.put("Date", 9);

        // #6 
        HashMap<String, Integer> shallowCopy = (HashMap<String, Integer>) originalMap.clone();
        System.out.println(shallowCopy);

        // #9
        Set<Map.Entry<String, Integer>> enSet = originalMap.entrySet();
        System.out.println("Set view of mappings: " + enSet);

        // #11
        Set<String> keySet = originalMap.keySet();
        System.out.println("Set view of keys: " + keySet);

        // #12
        Collection<Integer> values = originalMap.values();
        System.out.println("Collection view of values: " + values);

        // #3
        HashMap<String, Integer> nmap = new HashMap<>();
        nmap.putAll(originalMap);
        System.out.println("New map: " + nmap);

        // #8
        boolean v7 = originalMap.containsValue(7);
        boolean v10 = originalMap.containsValue(10);
        System.out.println("Map contains value 7: " + v7);
        System.out.println("Map contains value 10: " + v10);


    }
}
