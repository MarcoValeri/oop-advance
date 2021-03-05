public class Student extends Person {
    private String programme;
    private int year;

    public Student(String name, String programme, int year) {
        super(name);
        this.programme = programme;
        this.year = year;
    }

    public String getProgramme() {
        return programme;
    }

    public int getYear() {
        return year;
    }

    public void print() {
        super.print();
        System.out.println(programme + " " + year);
    }
}