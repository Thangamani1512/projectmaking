import java.util.Scanner;
class MethodOverloading
{
 String concate( String s, String u)
 {
    return( s+u);
	}
	String concate(String s,String u,String t)
	{
	return (s+u+t);
	}

	public static void main (String args[])
	{
	MethodOverloading m= new MethodOverloading();
	 m.concate("HELLO","WELCOME");
	 }
}
