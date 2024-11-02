package ISC_2024;
class Demand
{
    String pid,pname;
    int pdemand;
    Demand(String pd,String pnme,int pdem)
    {
        pid=pd;
        pname=pnme;
        pdemand=pdem;
    }
    void display()
    {
        System.out.print("Product ID:"+pid
                    +"\n"+"Product Name:"+pname);
    }
}