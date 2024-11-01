package ISC_2024;
import java.util.*;
class CardGame
{
    int cards[];
    int cap;
    int top;
    CardGame(int cc)
    {
        cap=cc;
        top=-1;
        cards=new int[cap];
    }
    void addCard(int v)
    {
        if(top==(cap-1))
        {
            System.out.println("CARD PILE IS FULL");
        }
        else
        {
            top++;
            cards[top]=v;
        }
    }
    int drawCard()
    {
        if(top==-1)
        {
            return -9999;
        }
        else
        {
            int x=cards[top--];
            return x;
        }
    }
    void display()
    {
        if(top==-1)
        {
            System.out.println("CARD PILE IS EMPTY");
        }
        else
        {
            System.out.println("Pile of Cards:");
            for(int i=0;i<cap;i++)
            {
                System.out.println(cards[i]);
            }
        }
    }
}