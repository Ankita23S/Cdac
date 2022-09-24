import java.lang.*;
import java.util.Scanner;
class PositiveNegative{
public static void main(String args[]){
System.out.println("Enter the number : ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();

if(num==0)
{
System.out.println("Zero is neither positive nor negative");
}


if(num>0)
{
System.out.println("The number is positive");
}
else if(num<0)
{
System.out.println("The number is negative");
}

}
}