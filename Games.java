import java.util.Scanner;

public class Games
 {
 public static void main(String args[])
    {
	// welcoming details using single line comment
	//System.out.println("*************************");
	// here using escape string newline
	System.out.println("WELCOME TO PARA OLYMBICS \n Life is precious \n Participation is experience ");
	//System.out.println("*************************");
	//Getting input from users
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter Your Name:" );
	String name= sc.nextLine();
	// here using tab escape string
	System.out.println( "welcome\t"+name);
	System.out.print("Enter year:" );
	int year= sc.nextInt();
	System.out.println(year);
	
	
	
	
	
	
	
	}
}	

	