import java.util.Scanner;
	
class Games
{
	/*  reference 
	
	int year;
	String season;
	String city;
	String country;
	int participant;
	*/
		
	 public void startgame()
	 {
		 System.out.println("Games started");
	 }
	public void addsports()
	  {
		 System.out.println("Games List");
	  }
		
	public void atheleteinfo()
	 {
		 System.out.println("Athelete details");
	 }

	//multiline comments for other method
	/*
     medalList()
	 dispalywinner()
	 displayschedule()
	 */

}
public class Olymbics
{
	
 public static void main(String args[])
    {
	// welcoming details using single line comment
	System.out.println("*************************");
	// here escape string new line and double quotes created
	System.out.println("WELCOME TO PARA OLYMBICS \n \"Enjoy Your Games\"");
	System.out.println("*************************");
	//Getting input from users
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter city:" );
	String city= sc.nextLine();
	// here using tab escape string and appending is done
	System.out.println( "welcome to\t"+city);
	System.out.print("Enter year:" );
	int year= sc.nextInt();
	System.out.println(year);
	System.out.print("Participant:");
	int participant=sc.nextInt();
	System.out.println(participant);
	System.out.print("Time:");
	Double time=sc.nextDouble();
	System.out.println(time);
	
	
	}
}	

	