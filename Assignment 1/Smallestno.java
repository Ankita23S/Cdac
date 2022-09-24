import java.lang.*;
import java.util.*;

class Smallestno{
public static void main(String args[]){
System.out.println(" Enter first number : ");
Scanner sc = new Scanner(System.in);
int num1=sc.nextInt();

System.out.println(" Enter Second number : ");
int num2=sc.nextInt();


System.out.println(" Enter third number : ");
int num3=sc.nextInt();

if(num1 < num2 && num1 < num3) 
{
System.out.println(" The first number is smallest = "+num1);
}
else if(num2<num3)
{
System.out.println(" The Second number is smallest = "+num2);
}

else
{
if(num3<num1 && num3<num2)
System.out.println(" The third number is smallest = "+num3);
}

}
}

/*
if(num1==num2 && num1<num3)
{
System.out.println(" Both first & Second number are smallest = "+num1);
}
else if(num1==num3 && num1<num2)
{
System.out.println(" Both first & third number are smallest = "+num1);
}
else
{
if(num2==num3 && num2<num1)
System.out.println(" Both Second & third number are smallest = "+num2);
}

if(num1==num2 && num1==num3)
{
System.out.println(" Both first & Second & third number are smallest = "+num1);
}

*/