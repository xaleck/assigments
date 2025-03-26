package archive.lambda_exersize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

interface InnerMain {
    void operate(int a, int b);
    
}



public class Main {
    public static void main(String[] args) {

        // #1
        InnerMain add = (int a, int b) -> {System.out.println(a+b);};
        add.operate(0, 345);
        InnerMain substract = (int a, int b) -> {System.out.println(a-b);};
        substract.operate(234, 12);
        InnerMain multiply = (int a, int b) -> {System.out.println(a*b);};
        multiply.operate(4, 56);
        InnerMain divide = (int a, int b) -> {System.out.println(a/b);};
        divide.operate(45, 5);

        // #2
        List<Integer> nums = Arrays.asList(3,5,2,4,6,8,68,54,21);
        Predicate<List<Integer>> filter = (arr) -> {
            List<Integer> filtered = new ArrayList<>();
            for(int el:arr){
                filtered.add(el);
            }
            System.out.println("Odd numbers: " + filtered);
            return true;
        };
        filter.test(nums);

        // #3
        List<String> names = Arrays.asList("asdf","qwert","dfsfs","edcfr" );
        names.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println(names);

        // #4
        List<String> result = new ArrayList<>();
        Function<String, String> rev = (n) -> (new StringBuilder(n.toUpperCase()).reverse().toString());
        names.forEach(w -> {
            result.add(rev.apply(w))  ;    
        } );
        // #5
        System.out.println(result);
        Consumer<String> con = (s) -> System.out.println(s);
        names.forEach(con
        );
        // #6
        names.forEach(System.out::println);
        // #7
        BiFunction<Integer, Integer,Integer> min = (a, b) -> {
            if(a > b){
                System.out.println("max is:" + a );
                System.out.println("min is:" + b );
                return a;
            }
            else {
                System.out.println("max is:" + b );
                System.out.println("min is:" + a );
                return b;
                
            }
        };
        min.apply(12,34);


    }    
}

    
