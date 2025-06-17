public class Employee {
    // attributes of Employee
        int employeeId;
        String name;
        String designation;
        String performanceStatus;
        int leave;

        //parameterized constructor using this keyword to get current object

        public Employee(int employeeId, String name, String designation, String performanceStatus)
        {
            this.employeeId = employeeId;
            this.name = name;
            this.designation = designation;
            this.performanceStatus = performanceStatus;
            this.leave= 0;
        }

        // This method gets override in subclass
        public double calculateSalary()
        {
            return 0;
        }
        // Track leaves of each employee
        public void trackLeave(int days)
        {
            leave += days;
            System.out.println("Total leaves taken by "+ name  + ":"+leave);
        }
     public void generatePayroll()
     {

         System.out.println("\npayroll for :" + name);
         System.out.println("ID :" + employeeId);
         System.out.println("Designation :" + designation);
         System.out.println("Performance :" + performanceStatus);
         System.out.println("Leaves :" + leave);
         System.out.println("Net salary :" + calculateSalary());
     }


    }

    // Subclass for full-time employee

    class FullTimeEmployee extends Employee {
        double monthlySalary;

        public FullTimeEmployee(int employeeId, String name, String designation, String performanceStatus, double monthlySalary) {

           // using super keyword to get values from parent class
            super(employeeId, name, designation, performanceStatus);
            this.monthlySalary = monthlySalary;
        }

        //overriding method
        public double calculateSalary() {

            return monthlySalary -(leave * 100);
        }
    }

    // Subclass for part-time employees
    class PartTimeEmployee extends Employee {
        double hourlyRate;
        int hoursWorked;

        public PartTimeEmployee(int employeeId, String name, String designation, String performanceStatus, double hourlyRate, int hoursWorked) {
            super(employeeId, name, designation, performanceStatus);
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }

        //overriding method

        public double calculateSalary() {
            int hours=Math.max(0,hoursWorked -(leave * 6) );
            return hourlyRate * hours;
    }
    }
