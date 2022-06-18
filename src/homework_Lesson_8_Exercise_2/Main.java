package homework_Lesson_8_Exercise_2;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(1, "Bobi", "Ivanov", 100);
        Employee employee2 = new Employee(2, "Mimi", "Hristova", 200);
        Employee employee3 = new Employee(3, "Tisho", "Botev", 300);

        System.out.println(employee);
        employee.getName();
        employee.getAnnualSalary();
        System.out.println();
        employee.raiseSalary(5);

        System.out.println();
        System.out.println(employee2);
        employee2.getName();
        employee2.getAnnualSalary();
        System.out.println();
        employee2.raiseSalary(10);

        System.out.println();
        System.out.println(employee3);
        employee3.getName();
        employee3.getAnnualSalary();
        System.out.println();
        employee3.raiseSalary(0);

    }
}
