import java.util.Scanner;
import java.lang.*;


class Sheet2_P5{

public static void main(String args[]){

for(int i=1;i<=5;i++)
{

for(int j=4; j>=i; j--)
{
System.out.print(" ");

}

for(int j=1; j<=i; j++)
{
System.out.print("*");


}

for(int j=1; j<i; j++)
// for(int j=0; j<i-1; j++)
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

*/
