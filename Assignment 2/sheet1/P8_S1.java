import java.util.Scanner;
import java.lang.*;

//Lower LHS starting with 5

class P8_S1{

public static void main(String args[]){

for(int i=5;i>=1;i--)

{
for(int j=1; j<i; j++)
{
System.out.print(" ");
}

for(int j=5; j>=i; j--)
//for(int j=5; j>=i; j--)

{
//System.out.print(" "+i);

System.out.print(" "+i);


}

System.out.println();
}

}
}


/*

for j:
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5

for i:
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5


*/

