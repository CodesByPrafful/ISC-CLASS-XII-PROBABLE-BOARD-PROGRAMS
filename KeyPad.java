package EIGHT_IMPORTANT_PROGRAMS_FOR_BOARDS;
import java.util.*;
class KeyPad
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int keystroke=0;
        System.out.print("Enter the word:");
        String s=sc.nextLine().toUpperCase();
        String wrd[]={"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            for(int j=0;j<wrd.length;j++)
            {
                int position=wrd[j].indexOf(ch);
                if(position!=-1)
                {
                    keystroke+=position+1;
                    break;
                }
            }
        }
        System.out.println("Total No. of Keystrokes:"+keystroke);
    }
}