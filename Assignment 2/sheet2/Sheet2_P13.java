import java.util.Scanner;
import java.lang.*;
//import java.math.*;
//Combine Upper LHS & Lower LHS

class Sheet2_P13{

public static void main(String args[]){
//prints upper half pattern
for(int i=1;i<=5;i++)
{
//prints i spaces at beginning
for(int j=1; j<i; j++)

{

System.out.print(" ");


}
//prints i to rows value at the end of each row
for(int j=i;j<=5;j++)

{
System.out.print("*");

}

System.out.println();
}
//prints lower half
for(int i=5-1; i>=1; i--)
//prints i spaces at beginning of each row
{
for(int j=1; j<i; j++)

{

System.out.print(" ");

}
//prints i to rows value at end
for (int j=i; j<=5; j++)
{
System.out.print("*");

}

System.out.println();
}


}
}

/*

*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****

*/
