package EIGHT_IMPORTANT_PROGRAMS_FOR_BOARDS;
import java.util.*;
class Goldbach
{
    boolean ChckPrime(int n)
    {
        int temp=0;
        for(int i=2;i<=(n-1);i++)
        {
            if(n%i==0)
            {
                temp++;
            }
        }
        if(temp==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p[]={3,5,7,11,13,17,19,23,29,31,37,41,43};
        System.out.print("N=");
        int n=sc.nextInt();
        System.out.print("ODD PRIME PAIRS:");
        for(int i=0;i<p.length-1;i++)
        {
            for(int j=0;j<p.length-1;j++)
            {
                if((p[i]+p[j])==n && p[i]<=p[j])
                System.out.println(p[i]+","+p[j]);
            }
        }
    }
}