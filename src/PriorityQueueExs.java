import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExs {

    public static void main(String[] args) {
        // #1
        PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Violet");
        colors.add("Cyan");
        
        PriorityQueue<String> colors_2 = new PriorityQueue<>();
        colors_2.add("Green");
        colors_2.add("Red");
        colors_2.add("Blac");
        colors_2.add("Blue");
        colors_2.add("Cyan");
        colors_2.add("Violet");

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(10, Collections.reverseOrder());        pq1.add(10);
        pq1.add(22);
        pq1.add(36);
        pq1.add(25);
        pq1.add(16);
        pq1.add(70);
        pq1.add(82);
        pq1.add(89);
        pq1.add(14);
        pq1.offer(45);

        // #3 
        PriorityQueue<String> colors_clone = new PriorityQueue<>();
        colors_clone.addAll(colors);
        System.out.println(colors_clone);
        // #7
        System.out.println(colors);
        System.out.println(colors_2);
        for(String el:colors){
            System.out.println(colors_2.contains(el));
        }
        // #12 
        Integer val = null;
        while( (val = pq1.poll()) != null) {
            System.out.print(val+"  ");
            }
	        System.out.print("\n");
        // #11
        System.out.println("Original queue" + colors);
        String colors_str = colors.toString();
        System.out.println("String one: " + colors_str);

        // #10 

        Integer[] nums_arr = (Integer[]) pq1.toArray();
        System.out.println("New array" + nums_arr);



    }
}