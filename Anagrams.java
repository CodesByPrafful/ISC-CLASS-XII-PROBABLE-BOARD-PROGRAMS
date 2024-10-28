package EIGHT_IMPORTANT_PROGRAMS_FOR_BOARDS;
import java.util.*;
class Anagrams
{
    static String s1;
    static String s2;
    Anagrams()
    {
        s1=s2="";
    }
    static String bubsort(String s)
    {
        char a[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            a[i]=ch;
        }
        char temp='\u0000';
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return String.valueOf(a);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter:");
        System.out.println("Enter the 1st String:");
        s1=sc.nextLine();
        System.out.println("Enter the 2nd String:");
        s2=sc.nextLine();
        s1=bubsort(s1);
        s2=bubsort(s2);
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("The two strings are Anagrams");
        }
        else
        {
            System.out.println("The two strings are Anagrams");
        }
    }
}