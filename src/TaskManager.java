import java.util.*;

public class TaskManager{
    PriorityQueue<Task> scheduled;
    Queue<Task> pending;
    TaskManager(){
     scheduled=new PriorityQueue<>();
     pending=new LinkedList<>();
    }

    void addTask(Task t){
     scheduled.add(t);
    }

    Task processScheduledTask(){
     return scheduled.poll();
    }

    Task processPendingTask(){
     return pending.poll();
    }

    void delayTask(String name){
     Iterator<Task> it=scheduled.iterator();
     while(it.hasNext()){
      Task t=it.next();
      if(t.taskName.equals(name)){
       it.remove();
       pending.add(t);
       break;
      }
     }
    }

    List<Task> getScheduledTasks(){
     List<Task> list=new ArrayList<>(scheduled);
     Collections.sort(list);
     return list;
    }

    List<Task> getPendingTasks(){
     return new ArrayList<>(pending);
    }

    void printScheduledTasks(){
     System.out.println("Scheduled Tasks (sorted by priority):");
     List<Task> list=getScheduledTasks();
   
      for(int i = 0; i<list.size(); i++){
       System.out.println(i+1 +". "+list.get(i));
      }
    }

    void printPendingTasks(){
     System.out.println("Pending Tasks (FIFO Order):");
     List<Task> list=getPendingTasks();
     if(list.isEmpty()){
      System.out.println("(No pending tasks)");
     } else {
        for(int i = 0; i<list.size(); i++){
            System.out.println(i+1 +". "+list.get(i));
            }
     }
    }

    void processTasks(){
     Task t=processScheduledTask();
     if(t!=null)System.out.println("Processing Task: "+t);
    }

    void processPendingTasks(){
     Task t=processPendingTask();
     if(t!=null)System.out.println("Processing Task: "+t);
    }

    void delayAndPrintTask(String name){
     delayTask(name);
     System.out.println("Delaying Task: "+name);
    }

   }