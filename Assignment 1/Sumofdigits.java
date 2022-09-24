
import java.lang.*;
import java.util.*;

class Sumofdigits{
public static void main(String args[]){
System.out.println("Enter the number for printing digits : ");
Scanner sc= new Scanner(System.in);
int num= sc.nextInt();
int sum=0;

if(num<=0)
{
System.out.println("Enter Positive No. and try again... ");
}

while(num>0)
{
int rem=(num%10);
sum=sum + rem;
num=num/10;
}
System.out.print(" Sum of digits of number is =  "+sum);
}
}
