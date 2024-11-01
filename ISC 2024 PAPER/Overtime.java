package ISC_2024;
import java.util.*;
class Overtime extends EmpSal
{
    int hours;
    double totsal;
    Overtime(String ename,int hrs,double totalsal)
    {
        super(ename,hrs,totalsal);
        hours=hrs;
        totsal=totalsal;
    }
    void calsal()
    {
        if(hours>40)
        {
            salary+=5000;
        }
        else if(hours>30 && hours<=40)
        {
            salary+=3000;
        }
        else
        {
            salary+=0;
        }
        totsal+=salary;
    }
    void show()
    {
        super.show();
        System.out.println("Total Salary:"+totsal);
    }
}