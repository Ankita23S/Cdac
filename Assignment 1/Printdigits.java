/*
import java.lang.*;
import java.util.*;

class Printdigits{
public static void main(String args[]){
System.out.println("Enter the number for printing digits : ");
Scanner sc= new Scanner(System.in);
int num= sc.nextInt();

while(num>0 || num<0)
{
if(num>0)
{
int rem=(num%10);
num=num/10;
int catch1=rem;
int catch2=catch1;
//System.out.println(catch1);

if(catch2>0)
{
System.out.print("  " +((catch2)%10));
catch2=(catch2)/10;
}
}

else
{
int rem=(num%10);
num=(-1)*(num/10);
int catch1=rem;

int catch2=catch1;
catch2=catch2*(-1);

//System.out.print("  #" +catch2);

if(catch2<0)
{

System.out.print(" $ " +catch2);
int rem2=catch2%10;
//System.out.print("  " +((catch2)%10));
//catch2=((-1)*(catch2))/10;
catch2=(-1)*(catch2/10);
//int catch3=rem2;
System.out.print("  " +rem2);
}
}

}

}
}

*/



import java.lang.*;
import java.util.*;

class Printdigits{
public static void main(String args[]){
System.out.println("Enter the number for printing digits : ");
Scanner sc= new Scanner(System.in);
int num= sc.nextInt();

while(num>0 || num<0)
{
if(num>0)
{
System.out.print("  "+(num%10));
num=num/10;
}
else
{

System.out.print("  "+(num%10));
num=(-1)*(num/10);
//num=(num/10);
}
}

}
}
