import java.util.Scanner;
import java.lang.*;

class Factorial{

public static void main(String args[]){

System.out.println("Enter number: ");
Scanner sc = new Scanner(System.in);
int num= sc.nextInt();
//System.out.println(+num);
int fact=1;
if(num<0)
{
System.out.println("Invalid");
};
for(int i=1;i<=num;i++)
{
fact=fact*i;
}

if(num>=0)
{
System.out.println("Factorial of given number is : " +fact);
}

}
}