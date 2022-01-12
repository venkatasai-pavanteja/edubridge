//program to implement shape constructor
package shape1;

public class shape1 {
		//Declaring Member variable of string Type
	static int count;
	public shape1()
	{
		count++;
	}
	public void count()
	{
		System.out.println(+count);
	}
	 
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		shape1 shape=new shape1();
		shape1 obj=new shape1();
		obj.count();
		shape.count();
	}
}