 import java.util.Scanner;
 public class Datatypes
{
  public static void main(String[] args)
     {
	 
	 	Scanner sc= new Scanner(System.in);
	  // addition using interger data type
	  int a= sc.nextInt();
	  int b=sc.nextInt();
	  System.out.println( "SUM:" +(a+b));
	  
	 //division using float data type
	 float f=sc.nextFloat();
	 float q=sc.nextFloat();
	  System.out.println( "DIVISION:" +(f/q));
	  
	  //Subraction using double
	  double d= sc.nextDouble();
	  double e=sc.nextDouble();
	  System.out.println("SUB:"+(d-e));
	  
	  //modulos operation using long
	  long l=sc.nextLong();
	  long u=sc.nextLong();
	  System.out.println("MODULUS:"+(l%u));
	  
	  //product using short datatype
	  short s= sc.nextShort();
	  short t=sc.nextShort();
	  System.out.println("PRODUCT:"+(s*t));
	  
	  // division using byte
	  byte b=sc.nextByte();
	  byte c=sc.nextByte();
	  System.out.println("DIVISION:"+(b/c)); 
	  
	  // addition using char
	  char g=sc.next().charAt(0);
	  char j=sc.next().charAt(0);
	  System.out.println("ADD:"+(g+j));
	  
	  // logical operator using boolen
	  boolean b1= true, b2=false;
	  System.out.println("AND OPERATION:"+(b1&&b2));
	   System.out.println("OR OPERATION:"+(b1||b2));
	    System.out.println("NOT OPERATION:"+(!b2));
	  
	 }
}
	  
	 