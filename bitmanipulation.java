/*bit manipulation operation for getting a bit,setting a bit, clearing a bit, updating a bit*/
import java.util.*;
class bitmanipulation
{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("ENTER 1 FOR GETTING A BIT\n 2 FOR SETTING A BIT\n 3 FOR CLEARING A BIT \n 4 FOR UPDATING A BIT");
        System.out.println("ENTER YOUR CHOICE");
        int choice=sc.nextInt();
        
        switch(choice)
        {
            case 1:
                {
                    System.out.println("ENTER THE DECIMAL NO=");
                    int n1=sc.nextInt();
                    /*
                    int binary[]=new int[40];
                    int i=0;
                    while(n1>0)
                    {
                        binary[i++]=n1%2;
                        n1=n1/2;
                    }
                    System.out.println("THE BINARY EQUIVALENT=");
                    for(i=0;i<=40;i++)
                    {
                        System.out.print(binary[i]);
                    }
                    */
                    System.out.println("ENTER THE POSITION YOU WANT BIT OF=");
                    int pos=sc.nextInt();
                    int bitmask=1<<pos;
                    int res=((bitmask&n1)==0)?0:1;
                    System.out.println("THE DESIRED BIT IS"+res);
                    break;
                }
            case 2:
                {
                    System.out.println("ENTER THE DECIMAL NO=");
                    int n2=sc.nextInt();
                    System.out.println("ENTER THE POSITION to SET BIT=");
                    int pos=sc.nextInt();
                    int bitmask=1<<pos;
                    int newnumber=bitmask|n2;
                    System.out.println("THE NEW NUMBER IS"+newnumber);
                    break;
                }
            case 3:
                {
                    System.out.println("ENTER THE DECIMAL NO=");
                    int n3=sc.nextInt();
                    System.out.println("ENTER THE POSITION YOU WANT TO CLEAR BIT=");
                    int pos=sc.nextInt();
                    int bitmask=1<<pos;
                    int notbitmask=~(bitmask);
                    int newnumber= notbitmask & n3;
                    System.out.println("THE NEW NUMBER IS"+newnumber);
                    break;
                }
            case 4:
                {
                    System.out.println("ENTER THE DECIMAL NO=");
                    int n3=sc.nextInt();
                    System.out.println("ENTER THE POSITION YOU WANT TO update BIT=");
                    int pos=sc.nextInt();
                    int bitmask=1<<pos;
                    System.out.println("ENTER what u want it to make\n PRESS 1 FOR MAKING IT 1 \n PRESS 0 TO MAKE IT 0");
                    int ch=sc.nextInt();
                    
                    if(ch==0)
                    {
                        int notbitmask=~(bitmask);
                        int newnumber= notbitmask & n3;
                        System.out.println("THE NEW NUMBER IS"+newnumber);
                    }
                    else if(ch==1)
                    {
                        int newnumber=bitmask|n3;
                        System.out.println("THE NEW NUMBER IS"+newnumber);
                    }
                    else
                    {
                        System.out.println("invalid choice made!");
                    }
                    break;
                }
            default:
                {
                    System.out.println("INVALID CHOICE IS MADE!");
                }
            }
    }
    
    
}