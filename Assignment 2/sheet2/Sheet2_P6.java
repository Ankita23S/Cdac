import java.util.Scanner;
import java.lang.*;


class Sheet2_P6{

public static void main(String args[]){

for(int i=1;i<=6;i++)
{

for(int j=1; j<i; j++)

{
System.out.print(" ");

}

for(int j=1; j<=(2*(6-i)-1); j++)
{
System.out.print("*");


}

System.out.println();
}

}
}

/*

*********
 *******
  *****
   ***
    *

*/

