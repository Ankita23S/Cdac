import java.util.Scanner;
import java.lang.*;
//import java.math.*;
//Combine Upper LHS & Lower LHS

class Sheet2_P15{

public static void main(String args[]){

for(int i=1;i<=5;i++)
{

for(int j=0; j<i; j++)

{
if(i != 5)
{
if(j==0 || j== i-1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
else
{
System.out.print("*");
}
}

System.out.println();
}
}
}

/*

*
**
* *
*  *
*****

*/
