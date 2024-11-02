package ISC_2024;
import java.util.*;
class Trans
{
    int arr[][];
    int m;
    Trans(int mm)
    {
        m=mm;
        arr=new int[m][m];
    }
    void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void transpose()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println("TRANSPOSE:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    void display()
    {
        System.out.println("ORIGINAL:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        transpose();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        Trans obj=new Trans(size);
        obj.fillarray();
        obj.display();
    }
}