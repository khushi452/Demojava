import java.util.Scanner;

// Record definition
record Employee(int eid, String Name, double sat) {

    // Compact constructor for validation
    public Employee {
        if (eid == 0) {
            throw new IllegalArgumentException("Employee ID cannot be zero!");
        }
    }
}

public class Main1 {
    public static void main(String[] args) {

        // try-with-resources
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            // Creating object (may throw exception)
            Employee E1 = new Employee(id, name, salary);

            // Output
            System.out.println(E1);
            System.out.println(E1.eid());
            System.out.println(E1.Name());
            System.out.println(E1.sat());

        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please try again.");
        }
    }
}