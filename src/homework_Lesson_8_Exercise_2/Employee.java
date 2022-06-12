package homework_Lesson_8_Exercise_2;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salaryPerMonth;

    public void setSalaryPerMonth(int salaryPerMonth) {
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

    public int getSalaryPerMonth() {
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

    public void raiseSalary () {
        double i= 0.1; //x% modify current salary
        double raiseSalary = salaryPerMonth*12 + (getSalaryPerMonth()*i)*12;
        System.out.println("The updated annual salary is: " + raiseSalary);
    }
}
