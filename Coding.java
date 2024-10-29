package ISC_2024;
import java.util.*;
class Coding 
{
    String wrd;
    int len;
    Coding()
    {
        wrd="";
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("INPUT:");
        wrd=sc.nextLine();
    }
    void find()
    {
        len=wrd.length();
        int max=(int)wrd.charAt(0),min=(int)wrd.charAt(0);
        for(int i=0;i<len;i++)
        {
            char ch=wrd.charAt(i);
            int x=(int)ch;
            System.out.println(ch+"="+x);
            if(x>max)
            {
                max=x;
            }
            if(x<min)
            {
                min=x;
            }
        }
        System.out.print("Lowest ASCII code:"+min
                   +"\n"+"Highest ASCII code"+max);
    }
    void show()
    {
        System.out.println("Original word:"+wrd);
        find();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Coding obj=new Coding();
        obj.accept();
        obj.show();
    }
}