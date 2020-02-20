package interest.total;
import java.util.Scanner;
public class Interest_cal
{
   public void interest() 
   {
	 System.out.format("%s","ENTER AMOUNT\nRATEOFINTEREST\nTIME PERIOD");
	 Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt();
	 float r=sc.nextFloat();
	 int t=sc.nextInt();
	 System.out.format("%s","please select the option\n1.CALCULATE SIMPLE INTEREST\n2.CALCULATE COMPOUND INTEREST");
	 int n=sc.nextInt();
	 if(n==1)
	 {
		 simple(a,r,t);
	 }
	 else if(n==2)
	 {
		 compound(a,r,t);
	 }
	 else
	 {
		 System.out.format("invalid option");
	 }
   }
   void simple(int a,float r,int t) 
   {
	 float f=(a*r*t)/100;
	 System.out.format("%s:%f","simple interest is",f);
   }
   void compound(int a,float r,int t)
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.format("%S","select \n1.quartrly compounding\n2.half yearly compounding3.yearly compounding");
	   int n=sc.nextInt();
	   if(n==1)
	   {
		 r=r/4;
		 t=4*t;
	   }
	   else if(n==2)
	   {
		   r=r/2;
		   t=2*t;
	   }
	   else
	   {
		   if(n!=3)
		   System.out.format("%s", "invalid option");
	   }
	   float p=(float)((float)a*Math.pow((1+(r/100)),t));
	   System.out.format("%s:%f","the comppund interest is",p);
   }
}
