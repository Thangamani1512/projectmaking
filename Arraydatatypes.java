import java.util.Scanner;
public class Arraydatatypes
{
  public static void main (String args[])
     {
	 //direct declaration
	 int num1[]={3,4,5,6,7,8};
	 System.out.println(num1[4]);
	
	// getting input from user
	Scanner sc= new Scanner(System.in);
	int size =sc.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++)
	{
		 arr[i]=sc.nextInt();
	 }
	 System.out.println("New array");
	 System.out.println(arr[2]);
	 // changing array value
	 num1[2]=1;
	  System.out.println(num1[2]);
	 
}
}

	 
