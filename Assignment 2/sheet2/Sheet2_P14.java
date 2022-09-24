import java.util.Scanner;
import java.lang.*;
//import java.math.*;
//Combine Upper LHS & Lower LHS

class Sheet2_P14{

public static void main(String args[]){

for(int i=1;i<=5;i++)
{

for(int j=1; j<i; j++)

{

System.out.print(" ");


}

for(int j=i;j<=5;j++)

{
System.out.print("*"+" ");

}

System.out.println(); 
}

for(int i=5; i>=1; i--)

{
for(int j=1; j<i; j++)

{

System.out.print(" ");

}

for (int j=i; j<=5; j++)
{
System.out.print("*"+" ");

}

System.out.println();
}


}
}

/*

* * * * *
 * * * *
  * * *
   * *
    *
    *
   * *
  * * *
 * * * *
* * * * *

*/
