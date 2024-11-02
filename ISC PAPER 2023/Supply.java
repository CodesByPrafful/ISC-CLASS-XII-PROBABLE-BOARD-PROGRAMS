package ISC_2024;
import java.util.*;
class Supply extends Demand
{
    int pproduced;
    double prate;
    Supply(String prodid,String prodname,int proddemand,double rate)
    {
        super(prodid,prodname,proddemand);
        pproduced=0;
        prate=rate;
    }
    double calculation()
    {
        pproduced=(int)(prate*pdemand);
        int difference=(int)((prate*pdemand)-(pproduced));
        return difference;
    }
    void display()
    {
        super.display();
        System.out.println("Difference in amount of demand and amount of supply:"+calculation());
    }
}