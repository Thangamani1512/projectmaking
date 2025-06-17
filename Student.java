public class Student {
    // Instance variables
    String name;
    int mark;

    //  Parameterized constructor 
    public Student(String stuName, int stuMark) {
        name = stuName;
        mark = stuMark;
    }
	//copy constructor
	Student(Student otherStudent) {
        name = otherStudent.name;
        mark = otherStudent.mark;
    }
     public void displayInfo() {
        System.out.println("Name: " +name);
        System.out.println("Age: " + mark);
    }

    public static void main(String[] args) {
        //  Parameterized constructor
        Student su = new Student("Java",100);
		// creating object for copy constructor
		Student su2 = new Student(su); 

        // Copied method
        su2.displayInfo();
    }
}
