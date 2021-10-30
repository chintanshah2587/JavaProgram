import java.util.*;
public class Exam
{
	public static void main(String[] args) {
		double n = Double.parseDouble(System.getenv("n"));
        double x = Double.parseDouble(System.getenv("x"));
		double sum=1;
		for(int i=2;i<=n;i++)
		{
		    double check=(double)Math.pow(x,i);
		    double f=fact(i);
		    sum= sum +(check/f);
		}
		System.out.println(" The value of sereis is: "+sum);
	}
	public static double fact(double n)
	{
	     double value=1;
	    for(int i=1;i<=n;i++)
	    {
	        value=value*(double)i;
	    }
	    return value;
	}
}
