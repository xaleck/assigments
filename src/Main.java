import java.util.*;



public class Main { 
    public static <T> List<T> mergeLists(List<T> l1, List<T> l2) {
        List<T> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < l1.size() || j < l2.size()) {
            if (i < l1.size()) {
                res.add(l1.get(i));
                i++;
            }
            if (j < l2.size()) {
                res.add(l2.get(j));
                j++;
            }
        }
        return res;
    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> e : map.entrySet())
            System.out.println(e.getKey() + " = " + e.getValue());
    }


        public static void main(String[] args){
                List<Task> tasks=new ArrayList<>();
                TaskManager sch=new TaskManager();

                tasks.add(new Task("Code Review",3,20));
                tasks.add(new Task("System Update",5,45));
                tasks.add(new Task("Database Backup",2,30));
                tasks.add(new Task("Deploy New Feature",5,50));
                tasks.add(new Task("Bug Fixing",4,25));


                System.out.println("Tasks Added:");

                for(Task t:tasks)System.out.println(t);;


                for(Task t:tasks)sch.addTask(t);

                sch.printScheduledTasks();
                sch.processTasks();
                sch.delayAndPrintTask("Code Review");
                sch.printScheduledTasks();
                sch.printPendingTasks();
                sch.delayAndPrintTask("Deploy New Feature");
                sch.printScheduledTasks();
                sch.printPendingTasks();
                sch.processTasks();
                sch.printScheduledTasks();
                sch.printPendingTasks();
                sch.processTasks();
                sch.printScheduledTasks();
                sch.printPendingTasks();
                sch.processPendingTasks();
                sch.printScheduledTasks();
                sch.printPendingTasks();
                sch.processPendingTasks();
                sch.printScheduledTasks();
                sch.printPendingTasks();
        }
      }