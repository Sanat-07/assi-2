import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", "Lennon", "Singer", 27045.78);
        Employee e2 = new Employee("George", "Harrison", "Guitarist", 50000.00);
        Student s1 = new Student("Ringo", "Starr", 2.5);
        Student s2 = new Student("Paul", "McCartney", 3.2);
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(e1);
        persons.add(e2);
        persons.add(s1);
        persons.add(s2);
        Collections.sort(persons);
        printData(persons);
    }

    public static void printData(Iterable<? extends Payable> list) {
        for (Payable p : list) {
            System.out.printf("%s earns %.2f tenge\n",
                    p.toString(),
                    p.getPaymentAmount());
        }
    }
}

