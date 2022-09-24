import java.util.Scanner;
import java.lang.*;

//Pyramid ABC

class P9_S1{

public static void main(String args[]){

for(char i='A'; i <='E';i++)

{
for(char j='E'; j>=i ; j--)
{
System.out.print(" ");
}

for(char j='A'; j<=i; j++)

{
//System.out.print(i+" ");

System.out.print(j+" ");


}

System.out.println();
}

}
}


/*

for j:
    A
   A B
  A B C
 A B C D
A B C D E

for i:
    A
   B B
  C C C
 D D D D
E E E E E


*/

