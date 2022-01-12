package average;

public class mainclass {

  public static double avg(double a,double b, double c)
  {
	  double result=(a+b+c)/3;
	  return result;
	  
  }
   public static void main(String[] args)
   {
	   double c = avg(74.67,63.50,97.54);
	   System.out.println("avg of three numbers is " +c);
	   
   }


}
