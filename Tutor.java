public class Tutor extends Person {
    private double salary;

    public Tutor(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void print() {
        super.print();
        System.out.println(salary);
    }
}