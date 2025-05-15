import java.util.Scanner;
class SuperClass
{
  public  void SuperClassMethod()
    {
        System.out.println("SUPER CLASS METHOD");
    }
}
 
class SubClass extends SuperClass
{
    //Override
  public  void SuperClassMethod()
    {
        System.out.println("SUPER CLASS METHOD IS OVERRIDDEN");
    }
}
public class MethodOverriding
{
public static void main (String args[])
{
SubClass su= new SubClass();
 su.SuperClassMethod();
 }
 }
