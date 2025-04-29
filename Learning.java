import java.util.Scanner;
public class Learning
{
 //attributes
  String title ="Grammer";
   String subject="English";
   String level="Easy";
   int age=10;
   
   //input from user using default constructor
 /* public Learning()
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Title:");
    title=sc.nextLine();
    System.out.println("subject:");
    subject=sc.nextLine();
    System.out.println("level:");
    level=sc.nextLine();
    System.out.println("age:");
   age=sc.nextInt();
  } */
public void playmodule()
{
System.out.println("PlAYING YOUR FAV VIDEO IN" + subject);
System.out.println("HAPPY LEARNING mode");

}
public void unlockbadges()
{
	System.out.println("YOU SCORED GOLD BADGE IN " + subject);
System.out.println("YOU ARE ROCKING");
}
public static void main (String args[])
{
Learning l1=new Learning();
l1.playmodule();
Learning l2=new Learning();
l2.unlockbadges();
}
}
