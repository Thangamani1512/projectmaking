public class Main {
    public static void main(String[] args) {
        // getting array values
        Employee[] emp = new Employee[3];
        System.out.println("-----------------------------");
        System.out.println("Employee Management Details");
        System.out.println("-----------------------------");
        //passing values  using parameterised constructor.
        emp[0] = new FullTimeEmployee(101, "Uma", "Manager", "Excellent", 6000);
        emp[1] = new PartTimeEmployee(102, "Harsh", "Assistant", "Good", 25, 80);
        emp[2] = new PartTimeEmployee(103, "Prakash", "Clerk", "Excellent", 20, 70);

        // tracking leaves for each employee

        emp[0].trackLeave(2);
        emp[1].trackLeave(6);
        emp[2].trackLeave(1);

        // getting details of each employee using for each method
        System.out.println("\n ----------------------------------");
        System.out.println(" GENERATING PAYROLL FOR EMPLOYEES");
        System.out.println("--------------------------------------");

    for(Employee employees : emp)
    {
        employees.generatePayroll();

    }

    }

}
