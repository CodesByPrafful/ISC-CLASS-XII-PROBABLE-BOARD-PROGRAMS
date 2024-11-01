package ISC_2024;
import java.util.*;
class EmpSal
{
    String empnum;
    int empcode;
    double salary;
    EmpSal(String epnum,int epcode,double sal)
    {
        empnum=epnum;
        empcode=epcode;
        salary=sal;
    }
    void show()
    {
        System.out.print("Employee Name:"+empnum
                    +"\n"+"Employee Code:"+empcode);
    }
}