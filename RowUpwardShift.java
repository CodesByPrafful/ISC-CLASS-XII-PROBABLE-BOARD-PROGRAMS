package EIGHT_IMPORTANT_PROGRAMS_FOR_BOARDS;
import java.util.*;
class RowUpwardShift
{
    static int m,n;//instance variables
    static int M[][];
    RowUpwardShift(int r,int c)
    {
        m=r;
        n=c;
        M=new int[r][c];
    }//end of the parameterized constructor
    static void insert()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                M[i][j]=sc.nextInt();
            }//end of inner for
        }//end of outer for
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(M[i][j]+" ");
            }//end of inner for
            System.out.println();
        }//end of outer for
    }//end of insert
    static void largesmall()
    {
        //finding the largest and the smallest
            int rmax=0,columnmax=0,largest=M[0][0],smallest=M[0][0],rmin=0,columnmin=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(M[i][j]>largest)
                    {
                        largest=M[i][j];
                        rmax=i;
                        columnmax=j;
                    }
                    if(M[i][j]<smallest)
                    {
                        smallest=M[i][j];
                        rmin=i;
                        columnmin=j;
                    }
                }
            }
            System.out.println("Largest:"+largest+","+"found at:"+rmax+","+columnmax);
            System.out.println("Smallest:"+smallest+","+"found at:"+rmin+","+columnmin);
    }
    static void shiftrowUp()
    {
        int sd[]=new int[m-1];
        //storing the 0th row in the SDA
        for(int i=0;i<m-1;i++)
        {
            sd[i]=M[0][i];
        }//end of for
        //shifting the first row upwards
        for(int i=1;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int temp=M[i][j];
                M[i][j]=M[i-1][j];
                M[i-1][j]=temp;
            }//end of inner for
        }//end of outer for
        //bringing the elements of the 0th row into the last row of the DDA
        for(int i=0;i<m-1;i++)
        {
            M[m-1][i]=sd[i];
        }//end of for
    }//end of shiftrowUp
    static void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(M[i][j]+" ");
            }//end of inner for
            System.out.println();
        }//end of outer for
    }//end of display
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("M=");
        m=sc.nextInt();
        System.out.print("N=");
        n=sc.nextInt();
        RowUpwardShift obj=new RowUpwardShift(m,n);
        insert();
        shiftrowUp();
        System.out.println("FORMED MATRIX AFTER ROTATING:");
        display();
        largesmall();
    }//end of main
}