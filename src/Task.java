public class Task implements Comparable<Task> {
    String taskName;
    int priority;
    int duration;

    Task(String taskName, int priority, int duration) {
        this.taskName = taskName;
        this.priority = priority;
        this.duration = duration;
    }

    public int compareTo(Task other) {
        if (priority != other.priority)
            return other.priority - priority;
        return duration - other.duration;
    }

    public String toString() {
        return "[Priority " + priority + "] " + taskName + " (Duration: " + duration + " mins)";
    }
}