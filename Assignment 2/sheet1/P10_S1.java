import java.util.Scanner;
import java.lang.*;

//Pyramid ABC

class P10_S1{

public static void main(String args[]){

for(char i='E'; i >='A';i--)

{
for(char j='A'; j<=i ; j++)
{
System.out.print(" ");
}

for(char j='E'; j>=i; j--)

{
System.out.print(i+" ");

//System.out.print(j+" ");


}

System.out.println();
}

}
}


/*

for j:
     E
    E D
   E D C
  E D C B
 E D C B A


for i:
     E
    D D
   C C C
  B B B B
 A A A A A


*/

