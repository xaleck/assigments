import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExs {
    

    public static <T> void n26(LinkedList<T> arrx, T el, int index){
        arrx.set(index, el);
        System.out.println(arrx);
    }  
    public static <T> void n24(LinkedList<T> arrx, LinkedList<T> arrz ){
        ArrayList<String> res = new ArrayList<>();
        if (arrx.size() > arrz.size()){
            for(T el:arrx){
                res.add(arrz.contains(el) ? "Y" : "N"  );
            }
        } else {
            for(T el:arrz){
                res.add(arrx.contains(el) ? "Y" : "N"  );
            }
        }
        System.out.println(res);
    }
    public static <T> void n17(LinkedList<T> arrx, LinkedList<T> arrz  ){
        for(T el:arrz){
        arrx.add(el);
        }
        System.out.println(arrx);
    }

    public static <T> void n9(LinkedList<T> arrx , List<T> arrz, int pos){
        arrx.addAll(pos, arrz);
        System.out.println(arrx);
    }
    public static <T> void n10(LinkedList<T> arrx ){
        System.out.println("First is " + arrx.getFirst() );
        System.out.println("Last is " + arrx.getLast() );
    }
    public static <T> void n15(LinkedList<T> arrx, int i1, int i2  ){
       Collections.swap(arrx, i1, i2);
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("qsef");
        list.add("edcf");
        list.add("vbnm");
        list.add("vvbgnm");
        list.add("bgnm");
        list.add("fgdlofgkd");
        list.add("fgdl");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("qsef");
        list2.add("edcf");
        list2.add("bgnm");
        list2.add("fgdlofgkd");
        list2.add("fgdlofgkd");
        list2.add("vbnm");
        list2.add("fgdl");
        list2.add("vvbgnm");

        n10(list);
        n24(list, list2);
        n17(list, list2);
        n26(list, "Sans", 2);
        n15(list, 0, 5);
        n9(list, list2, 3);

    }    
}