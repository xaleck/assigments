import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(45);
        hs.add(4353);
        hs.add(757567);
        hs.add(46);
        hs.add(-1);
        hs.add(-145);
        HashSet<Integer> hd = new HashSet<>();
        hd.add(45);
        hd.add(4353);
        hd.add(45675675);
        hd.add(46);
        hd.add(-1);
        // #11
        HashSet<Integer> res = new HashSet<>();
        for(Integer el:hs){
            if(hd.contains(el)){
                res.add(el);
            }

        }
        System.out.println(res);

        // #10
        System.out.println(hs);
        System.out.println(hd);
        for(Integer el:hs){
            System.out.println(hd.contains(el)? "Yes" : "NO");
        }
        // #7
        
        Integer[] hs_arr = new Integer[hs.size()];
        hs.toArray(hs_arr); 
        System.out.println(Arrays.toString(hs_arr));

        // #8

        TreeSet<Integer> hs_tree = new TreeSet<>();
        hs_tree.addAll(hs);
        System.out.println( hs_tree);




        // #12
        hs.removeAll(hs);
        System.out.println(hs);

    }
    
}