import java.util.PriorityQueue;

public class ToDoList {
    private PriorityQueue<Task> tasks;

    public ToDoList() {
        tasks = new PriorityQueue<>();
    }

    public void addTask(int deadline, String name) {
        Task newTask = new Task(deadline, name);
        tasks.offer(newTask);
        System.out.println(deadline + ", " + name);
    }

    public void getNextTask() {
        if (tasks.isEmpty()) {
            System.out.println("Tidak ada tugas yang harus diselesaikan.");
        } else {
            Task nextTask = tasks.peek();
            System.out.println("Task terdekat yang harus diselesaikan: " + nextTask);
        }
    }

    public void completeTask() {
        if (tasks.isEmpty()) {
            System.out.println("Tidak ada tugas yang harus diselesaikan.");
        } else {
            Task completedTask = tasks.poll();
            System.out.println(completedTask + " selesai dilaksanakan.");
            getNextTask();
        }
    }

    public void clearTasks() {
        tasks.clear();
        System.out.println("Semua tugas telah dihapus.");
    }
}