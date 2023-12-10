class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void applyRaise(double percentage) {
        double raiseAmount = monthlySalary * (percentage / 100);
        monthlySalary += raiseAmount;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", 5000.0);
        Employee employee2 = new Employee("Jane", "Smith", 6000.0);

        System.out.println("Yearly Salary for " + employee1.getFirstName() + " " + employee1.getLastName() + ": " +
                employee1.getYearlySalary());
        System.out.println("Yearly Salary for " + employee2.getFirstName() + " " + employee2.getLastName() + ": " +
                employee2.getYearlySalary());

        employee1.applyRaise(10);
        employee2.applyRaise(10);

        System.out.println("\nAfter 10% Raise:");
        System.out.println("Yearly Salary for " + employee1.getFirstName() + " " + employee1.getLastName() + ": " +
                employee1.getYearlySalary());
        System.out.println("Yearly Salary for " + employee2.getFirstName() + " " + employee2.getLastName() + ": " +
                employee2.getYearlySalary());
    }
}