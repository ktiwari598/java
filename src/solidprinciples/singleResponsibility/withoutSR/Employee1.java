package solidprinciples.singleResponsibility.withoutSR;

/**
 * In this design, the Employee class has two responsibilities: managing employee details (name, address) and calculating salary.
 * According to the Single Responsibility Principle, it's better to separate these responsibilities into different classes.
 */
public class Employee1 {
        private String name;
        private String address;
        private double salary;

        // Constructor, getters, setters

        public double calculateSalary() {
            // Salary calculation logic
            return salary;
        }

        // Other methods related to employee details
}
