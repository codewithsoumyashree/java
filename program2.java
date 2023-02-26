/*WAP that inputs the number of hours that an employee works and the employee's hourly wages.
Then display the employee's gross pay*/
import java.util.Scanner;
class c2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of hours:");
        int hours=sc.nextInt();
        System.out.println("Enter the wages:");
        int wages=sc.nextInt();
        System.out.println("NO OF HOURS ="+hours);
        System.out.println("WAGES="+wages);
        System.out.println("THE GROSS PAY="+(hours*wages));
    }
}