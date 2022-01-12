//program to implement shape constructor
package shape;

public class shape {
	//Declaring Member variable of string Type
static int count;
public shape()
{
	count++;
}
public void count()
{
	System.out.println(+count);
}
 
public static void main(String[] args) {
	//TODO Auto-generated method stub
	
	shape shape=new shape();
	shape obj=new shape();
	obj.count();
	shape.count();
}

}




