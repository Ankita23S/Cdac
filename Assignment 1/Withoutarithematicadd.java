import java.lang.*;
import java.util.*;

class Withoutarithematicadd{
public static void main(String args[]){
System.out.println(" Enter first number : ");
Scanner sc = new Scanner(System.in);
int num1=sc.nextInt();

System.out.println(" Enter Second number : ");
int num2=sc.nextInt();
int i=0;

if(i<=num2) 
{
for( i = 0; i<num2; i++)
{
num1++;

}
System.out.println(" Addition of two numbers is = "+num1);
}
else 
{
{
for(i=0 ; i>num2; i--)
num1--;
}
System.out.println(" Addition of two numbers is = "+num1);
}
}
}

