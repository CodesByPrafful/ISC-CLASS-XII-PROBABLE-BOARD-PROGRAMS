package ISC_2024;
import java.util.*;
class NumDude
{
    int num;
    NumDude()
    {
        num=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        num=sc.nextInt();
    }
    int sumDigits(int x)
    {
        if(x==0)
        {
            return 0;
        }
        else
        {
            int r=x%10;
            return (r+sumDigits(x/10));
        }
    }
    void isDude()
    {
        int check=sumDigits(num);
        if((Math.pow(check,3))==num)
        {
            System.out.println("It is a Dudeney Number");
        }
        else
        {
            System.out.println("It is not a Dudeney Number");
        }
    }
    public static void main(String args[])
    {
        NumDude obj=new NumDude();
        obj.input();
        obj.isDude();
    }
}