public class Person {
  String firstName;
  String lastName;
  int age;
   
  public Person()
  
  {
	  System.out.println("This is default constructor");
	  firstName="Java";
	  lastName="Programming";
	  
  }

  public static void main(String args[]) {
  //default constructor created here
      Person myPerson = new Person();
       System.out.println(myPerson.firstName+ myPerson.lastName);
      myPerson.firstName = "Thangamani";
      myPerson.lastName = "selvakuamr";
      myPerson.age=28;
     System.out.println(myPerson.age);
      
     System.out.println(myPerson.firstName);
      
  }
}
