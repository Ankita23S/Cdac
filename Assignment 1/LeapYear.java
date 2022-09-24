import java.lang.*;
import java.util.Scanner;
class LeapYear{
public static void main(String args[]){

System.out.println("Enter the year : ");
Scanner sc=new Scanner(System.in);
int year=sc.nextInt();

//System.out.println("Given year :" +year);

if(year%4 ==0)
{

if(year%100 ==0)
{

if(year%400 ==0)

System.out.println("It is a leap year");

else


System.out.println("Not a leap year");
//common statement for 100 & 400 .. when year%400 == 0 && year%100 == 0 is false

}
else
System.out.println("It is a leap year");
// when year%4 ==0 is true
}
else
System.out.println("Not a leap year");
//when year%4 ==0 is false
}
}
