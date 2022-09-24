import java.util.Scanner;
import java.lang.*;
// lower RHS triangle

class P6_S1{

public static void main(String args[]){

for(int i=0; i<6 ; i++)
{
for(int j=(2*(5-i)); j>=0 ; j--)
//to give gap of 2
{
System.out.print(" ");
}
for (int j=0; j<=i;j++)
{
//System.out.print(i);
System.out.print("* ");
//* & gap 
}

System.out.println();
}

}
}


/*

        *
      * *
    * * *
  * * * *
* * * * *

for j:
    1
   21
  321
 4321
54321

for i:
    1
   22
  333
 4444
55555
 
*/