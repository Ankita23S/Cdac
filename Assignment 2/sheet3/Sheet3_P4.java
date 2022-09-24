import java.util.Scanner;
import java.lang.*;
//pattern pyramid

class Sheet3_P4{

public static void main(String args[]){
int k=0;
for(int i=0;i<9;i++)
{
 k=1;
for(int j=0; j<(9+i); j++)
{
if(j<(9-i-1))
{
System.out.print("  ");
}
else
{
System.out.print(" "+k);
if(j<(9-1))
{
k++;
}
else
{ 
k--;
}
}
}
System.out.println("  ");
}

}
}

/*

                 1
               1 2 1
             1 2 3 2 1
           1 2 3 4 3 2 1
         1 2 3 4 5 4 3 2 1
       1 2 3 4 5 6 5 4 3 2 1
     1 2 3 4 5 6 7 6 5 4 3 2 1
   1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
 1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

*/
