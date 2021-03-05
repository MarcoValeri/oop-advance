public class PersonStudentTutorTest {
    
    public static void main(String[] args) {

        Person[] people = new Person[10];

        // 0
        Person marco = new Person("Marco");
        people[0] = marco;

        // 1
        Person caterina = new Person("Caterina");
        people[1] = caterina;

        // 2
        Student india = new Student("India", "Computer Science", 2021);
        people[2] = india;

        // 3
        Student carmen = new Student("Carmen", "Computer Science", 2021);
        people[3] = carmen;

        // 4
        Student alessio = new Student("Alessio", "Computer Science", 2021);
        people[4] = alessio;

        // 5
        Student mindy = new Student("Mindy", "Computer Science", 2021);
        people[5] = mindy;

        // 6
        Student carlos = new Student("Carlos", "Computer Science", 2021);
        people[6] = carlos;

        // 7
        Student matt = new Student("Matt", "Computer Science", 2021);
        people[7] = matt;

        // 8
        Tutor Toby = new Tutor("Toby", 70000);
        people[8] = Toby;

        // 9
        Tutor Gordon = new Tutor("Gordon", 90000);
        people[9] = Gordon;

        for (Person p : people) {
            p.print();
        }

    }

}
