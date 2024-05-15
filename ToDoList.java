public class PojoClass implements Comparable<PojoClass> {
    private int deadline;
    private String name;

    public PojoClass(int deadline, String name) {
        this.deadline = deadline;
        this.name = name;
    }

    public int ambilDeadline() {
        return deadline;
    }

    public void aturDeadline(int deadline) {
        this.deadline = deadline;
    }

    public String ambilNama() {
        return name;
    }

    @Override
    public int compareTo(PojoClass other) {
        return Integer.compare(this.deadline, other.deadline);
    }

    @Override 
    public String toString() {
        return name + " (deadline: " + deadline + ")";
    }
}