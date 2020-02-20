package interest.total;
import java.util.Scanner;
public class Totalcost_cal 
{
  public void totalcost() 
  {
     Scanner sc=new Scanner(System.in);
     System.out.format("%S","enter the total area in sq feet");
     int n=sc.nextInt();
     System.out.format("%S","select\n 1.standard material\n2.above stanadrd material\n3.highly standard material\n4.highly standard and to fully automate the home");
     int ch=sc.nextInt();
     int k=0;
     if(ch==1)
     {
    	 n=n*1200;
     }
     else if(ch==2)
     {
    	 n=n*1500;
     }
     else if(ch==3)
     {
    	 n=n*1800;
     }
     else if(ch==4)
     {
    	 n=n*2500;
     }
     else
     {
    	 k=1;
    	 System.out.format("%S","invalid option");
     }
     if(k!=1)
     System.out.format("%S:%d","total cost",n);
  }
}
