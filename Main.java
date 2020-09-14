package home_work1009;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                        Employee.builder().age(42).name("Alex").gender("Female").address("Ashkelon").build(),
                        Employee.builder().age(40).name("Ben").gender("Male").address("Tel Aviv").build(),
                        Employee.builder().age(44).name("Carl").gender("Male").address("Ashkelon").build(),
                        Employee.builder().age(50).name("Dani").gender("Female").address("Ashdod").build(),
                        Employee.builder().age(49).name("Eli").gender("Female").address("Rechovot").build(),
                        Employee.builder().age(41).name("Fred").gender("Male").address("Haifa").build(),
                        Employee.builder().age(39).name("Bob").gender("Male").address("Ashkelon").build());

        Double average = employees.stream()
                .filter(s -> s.getGender().equals("Female"))
                .mapToInt(Employee::getAge).average().orElse(0.0);
        System.out.println("The average age of females is:" +average);
        System.out.println("****************************");

        employees.stream()
                .filter(s -> s.getName().startsWith("B"))
                .forEach(x -> System.out.println("Employees whose names begin with B are: "+x.getName()));
        System.out.println("****************************");

        employees.stream()
                .filter(s -> s.getAddress().equals("Ashkelon"))
                .forEach(x -> System.out.println("Employees who live in Ashkelon are: "+x.getName()));
        System.out.println("****************************");

        int oldest=
        employees.stream()
                .mapToInt(Employee::getAge).max().orElse(0);
        System.out.println("The oldest employee is: "+oldest);

 //how to get oldest employee's name?

    }

}
