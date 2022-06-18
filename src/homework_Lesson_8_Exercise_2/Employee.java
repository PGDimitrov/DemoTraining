package homework_Lesson_8_Exercise_2;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private double salaryPerMonth;

    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public Employee(int id, String firstName, String lastName, int salaryPerMonth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryPerMonth = salaryPerMonth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }

    public void getName () {
        System.out.printf("%s %s, \n",getFirstName(), getLastName());
    }

    public void getAnnualSalary () {
        System.out.printf("%s %s, annual salary is: " + 12*getSalaryPerMonth(), getFirstName(), getLastName());
    }

    public void raiseSalary (double percentageUpdate) {
        salaryPerMonth = salaryPerMonth + (salaryPerMonth * percentageUpdate/100);
        System.out.println("Updated monthly salary is: " + salaryPerMonth);
        System.out.println("Updated annual salary is: " +salaryPerMonth*12);
    }

}
