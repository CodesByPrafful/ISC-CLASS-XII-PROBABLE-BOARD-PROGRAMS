//Unique Number - A Number in which no digits are repeated is called a Unique Number
package EIGHT_IMPORTANT_PROGRAMS_FOR_BOARDS;
import java.util.*;
class UniqueNumber
{ 
    static boolean isUnique(int n)
    {
        int c=0;
        int flag=0,freq=0;
        int i,r,t;
        for(i=9;i>=0;i--)
        {
            c=0;
            t=n;
            while(t!=0)
            {
               r=t%10;
               if(r==i)
               {c++;}
               t=t/10; 
            }
            if(c>1)
            flag=1;
            break;
        }
        if(flag==0)
        return true;
        else
        return false;
        }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int freq=0;
        if(m<n)
        {
            for(int i=m;i<n;i++)
            {
                if(isUnique(i)==true)
                {
                    freq++;
                    System.out.print(i+",");
                }
            }
        }
        System.out.println("Frequency:"+freq);
    }
}
//Algorithm:- 
/*
 * Start
 * Taking Input
 * Taking a Counter variable to check the occurences of digits
 * Taking flag variable , if "0" then it is "Unique" else it is "Not unique"
 * Taking a Loop from 0-9(Decimal No. System)
 * Taking a temporary variable t to store the original number
 * Extracting the digits using while loop till t becomes zero
 * Comparing the digits with the iterating variable 
 * Counting the occurences
 * If occurences are more than 1 then flag is set to 1(not unique) 
 * Printing the Statements
 * End
 */