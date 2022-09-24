import java.util.Scanner;
import java.lang.*;
// Upper RHS triangle

class Sheet2_P4{

public static void main(String args[]){

for(int i=1; i<=5 ; i++)
{
for(int j=1; j<i ; j++)
{
System.out.print(" ");
}
for (int j=5; j>=i;j--)
{
//System.out.print(i);
System.out.print("*");
}

System.out.println();
}

}
}

//first we have spaces so condition for spaces then print values

/*

*****
 ****
  ***
   **
    *

for j:
54321
 5432
  543
   54
    5

for i:
11111
 2222
  333
   44
    5
 
*/