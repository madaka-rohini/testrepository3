package interest.total;
import java.util.*;
public class Mainm 
{
  public static void main(String arg[])
  {
	 Scanner sc=new Scanner(System.in);
	System.out.format("%s","please select the option\n1.CALCULATE INTEREST\n2.CALCULATE TOTAL COST FOR HOUSE CONSTRUCTION");
	int n=sc.nextInt();
	if(n==1)
	{
	  Interest_cal p=new Interest_cal();
	  p.interest();
	}
	else if(n==2)
	{
		Totalcost_cal q=new Totalcost_cal();
		q.totalcost();
	}
	else
		System.out.format("%s","invalid option");
  }
}
