import java.util.ArrayList;

public class Array {
    public static void main(String[] args)
    {
                // Create an ArrayList to store Employee objects
                ArrayList<Employee> employeeList = new ArrayList<>();

                // Add Employee objects to the list
                employeeList.add(new Employee(1, "reena", 50000));
                employeeList.add(new Employee(2, "teju", 60000));


                // Display all employees before removal
                System.out.println("Employees before removal:");
                for (Employee emp : employeeList) {
                    emp.display();
                }

                // Remove an employee
                employeeList.removeIf(emp -> emp.id == 1);

                // Display all employees after removal
                System.out.println("\nEmployees after removal of ID 2:");
                for (Employee emp : employeeList) {
                    emp.display();
                }
            }

    }
