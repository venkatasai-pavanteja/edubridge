//program to implement withargument constructor
package withargument;
import java.util.*;
public class withargument {
     //Declaring Member variable of String Type
	String string;
	//Constructor eith argument
	public withargument(String str)
	{
		System.out.println("User Entered this string  :"+str);
	}
	//Constructor with no Argument
	public withargument()
	{
		string="welcome to Java Programming" ;
	}
     void display()
     {
    	 System.out.println(string);
    	 
     };
     
     
     public static void main(String[] args) {
    	 // TODO Auto-generated method stub
    	 System.out.println("Enter a string");
    	 Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //creating object and passing no argument
        withargument ref = new withargument();
        //calling display method using ref object
        ref.display();
     }
     
}        
        
        
     

