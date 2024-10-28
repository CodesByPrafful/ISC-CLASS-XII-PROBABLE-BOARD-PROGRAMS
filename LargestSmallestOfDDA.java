package EIGHT_IMPORTANT_PROGRAMS_FOR_BOARDS;
import java.util.*;
class LargestSmallestOfDDA
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        if((m>2 && m<20) && (n>2 &&n<20))
        {
            int a[][]=new int[m][n];
            System.out.println("Elements input:");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Matrix:");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            //finding the largest and the smallest
            int rmax=0,columnmax=0,largest=a[0][0],smallest=a[0][0],rmin=0,columnmin=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(a[i][j]>largest)
                    {
                        largest=a[i][j];
                        rmax=i;
                        columnmax=j;
                    }
                    if(a[i][j]<smallest)
                    {
                        smallest=a[i][j];
                        rmin=i;
                        columnmin=j;
                    }
                }
            }
            System.out.println("Largest:"+largest+","+"found at:"+rmax+","+columnmax);
            System.out.println("Smallest:"+smallest+","+"found at:"+rmin+","+columnmin);
            //storing DDA into SDA
            int temp[]=new int[m*n];
            int k=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    temp[k++]=a[i][j];
                }
            }
            //bubblesort
            int temp1=0;
            for(int i=0;i<temp.length-1;i++)
            {
                for(int j=0;j<temp.length-i-1;j++)
                {
                    if(temp[j]>temp[j+1])
                    {
                        temp1=temp[j];
                        temp[j]=temp[j+1];
                        temp[j+1]=temp1;
                    }
                }
            }
            //putting sda back to dda
            k=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]=temp[k++];
                }
            }
            //display
            System.out.println("Rearranged Matrix:");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
