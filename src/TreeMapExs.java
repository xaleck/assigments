import java.util.*;  

public class TreeMapExs {
    public static void main(String[] args) {

        // #7
        TreeMap<String,String> tm=new TreeMap<String,String>(new sort_key());      
        tm.put("c1", "Red");
        tm.put("c2", "Green");
        tm.put("c3", "Black");
        tm.put("c6", "White");
        tm.put("c5", "Blue");


        System.out.println(tm);

        // #10

        ArrayList<String> reverse = new ArrayList<>();
        reverse.addAll(tm.descendingMap().values());
        System.out.println(reverse);
        
        // #16

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(10, "Apple");
        treeMap.put(20, "Banana");
        treeMap.put(30, "Cherry");
        treeMap.put(40, "Date");

        int targetKey = 25;
        Map.Entry<Integer, String> le = treeMap.lowerEntry(targetKey);
        if (le != null) {
            System.out.println("Lower entry for key " + targetKey + " is: " + le.getKey() + " = " + le.getValue());
        } else {
            System.out.println("No lower entry found for key " + targetKey);
        }

        // #21
        System.out.println(treeMap.subMap(10, 30));

        // #25
        Map.Entry<Integer, String> ceilingEntry = treeMap.ceilingEntry(targetKey);
        if (ceilingEntry != null) {
            System.out.println("Ceiling entry for key " + targetKey + ": " + ceilingEntry.getKey() + " = " + ceilingEntry.getValue());
        } else {
            System.out.println("No ceiling entry found for key " + targetKey);
        }

        // #15
        Integer higherKey = treeMap.higherKey(targetKey);
        if (higherKey != null) {
            System.out.println("Higher key than " + targetKey + ": " + higherKey);
            System.out.println("Value: " + treeMap.get(higherKey));
        } else {
            System.out.println("No higher key found for key " + targetKey);
        }


    }
}
class sort_key implements Comparator<String>{
    @Override
   public int compare(String str1, String str2) {
       return str1.compareTo(str2);
   }
    
}