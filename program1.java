/*wap that asks the user to enter two numbers, obtains the two numbers from the user,
and prints the sum, product,difference, and quotient of the two numbers*/
import java.util.Scanner;
class c1
{
public static void main(String[] args)
{
int num1, num2;
Scanner sc= new Scanner(System.in);
System.out.println("Enter two values:");
num1=sc.nextInt();
num2=sc.nextInt();
System.out.println("THE SUM="+(num1+num2));
System.out.println("THE PRODUCT="+(num1*num2));
System.out.println("THE DIFFERENCE="+(num1-num2));
System.out.println("THE QUOTIENT ="+(num1/num2));
}
}