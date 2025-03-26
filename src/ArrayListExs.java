import java.util.ArrayList;

public class ArrayListExs {
    public static <T> void n22(ArrayList<T> arrx){
        for(int i =0; i < arrx.size() ; i++){
            System.out.println(arrx.get(i));
        }
        return;
    } 
    public static <T> void n21(ArrayList<T> arrx, T el){
        arrx.set(1, el);
    }
    public static <T> void n20(ArrayList<T> arrx, int increase_num ){
        arrx.ensureCapacity(increase_num);
        System.out.println("now size of arrya was increased up to" + increase_num);
    }
    public static <T> void n19(ArrayList<T> arrx){
        System.out.println(arrx);
        arrx.trimToSize();
    }
    public static <T> void n18(ArrayList<T> arrx){
        if (arrx.isEmpty()){
            System.out.println("Empty");
        } else {
        System.out.println("Not empty");
        }
    }
    public static <T> void n17(ArrayList<T> arrx ){
        arrx.clear();
        System.out.println(arrx);
    }
    public static void main(String[] args) {
            ArrayList<String> arrx =new ArrayList<String>();
            arrx.add("Sans");
            arrx.add("Papyrus");
            arrx.add("Asgore");
            arrx.add("Toriel");
            arrx.add("Frisk");
            arrx.add("ALphys");
            arrx.add("Undyne");            
            n21(arrx, "Prunsel");
            n22(arrx);
            n20(arrx, 20);
            n19(arrx);

            n18(arrx);
            n17(arrx);
            n18(arrx);
    }
    
    

}