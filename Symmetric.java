package EIGHT_IMPORTANT_PROGRAMS_FOR_BOARDS;
import java.util.*;
class Symmetric
{
    static int M;
    static int A[][];
    Symmetric(int rc)
    {
        M=rc;
        A=new int[M][M];
    }
    static void insert()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements in the array:");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean SymmetricCheck()
    {
        int c=0;
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(A[i][j]==A[j][i])
                return true;
            }
        }
        return false;
    }
    static void DiagonalSum()
    {
        //left diagonal
        double s1=0.0D,s2=0.0D;
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(i==j)
                {
                    s1=s1+A[i][j];
                }
            }
        }
        System.out.println("Left-Diagonal Sum:"+s1);
        //right diagonal
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                if((i+j)==M)
                {
                    s2=s1+A[i][j];
                }
            }
        }
        System.out.println("Right-Diagonal Sum:"+s2);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("M=");
        if(M>2 && M<10)
        {
        int M=sc.nextInt();
        Symmetric obj=new Symmetric(M);
        insert();
        if(SymmetricCheck()==true)
        {
            System.out.println("THE GIVEN MATRIX IS SYMMETRIC");
            DiagonalSum();
        }
        else
        {
            System.out.println("THE GIVEN MATRIX IS NOT SYMMETRIC");
            DiagonalSum();
        }
        }
        else
        {
            System.out.println("Invalid Size");
        }
    }
}