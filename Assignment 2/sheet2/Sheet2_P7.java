import java.util.Scanner;
import java.lang.*;
//import java.math.*;
//Combine Upper LHS & Lower LHS

class Sheet2_P7{

public static void main(String args[]){
int space =1;int rows=5;

for(int i=1;i<=rows;i++)

{

for(int j=1; j<=rows -i ; j++)

{
System.out.print(" ");
}
for( int j=1; j<= i * 2-1; j++)
{
System.out.print("*");
}
System.out.println();
}
for(int i=rows-1; i >0; i--)
{
for(int j=1; j<= rows -i; j++)
{
System.out.print(" ");
}
for(int j=1; j<=i*2-1; j++)
{
System.out.print("*");
}
System.out.println();
}


}
}

/*

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/
