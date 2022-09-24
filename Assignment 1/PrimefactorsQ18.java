import java.util.Scanner;
import java.lang.*;

class FactorsQ9{

public static void main(String args[]){

System.out.println("Enter number: ");
Scanner sc = new Scanner(System.in);
int num= sc.nextInt();
int flag=0;

if(num<0)
{
System.out.println("Invalid");
}
else
{
for(int i = 2; (i<=(num/2)) ; i++)
{
if(num%i==0)
{
System.out.println("Has no prime factors ");
flag = 1;
break;
}
else if(flag==0)
{
System.out.println("Has no prime factors "+i);
}
}

}
}
}