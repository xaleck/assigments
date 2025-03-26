import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExs {
    public static void main(String[] args) {
        // #1
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Violet");
        colors.add("Cyan");
        System.out.println(colors);

        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(45);
        nums.add(4);
        nums.add(56);
        nums.add(6);
        nums.add(-9);
        nums.add(2);
        

        
        // #16
        colors.remove("Cyan");
        System.out.println(colors);

        // #15
        String last = colors.last();
        colors.remove(last);
        System.out.println(last + "  " + colors);

        // #13


        System.out.println("lower than 7 for example" + nums.lower(7) );

        // #6

        TreeSet<Integer> nums_clone = (TreeSet<Integer>) nums.clone();
        System.out.println(nums_clone);

        // #4

        Iterator<Integer> iter = nums.descendingIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
