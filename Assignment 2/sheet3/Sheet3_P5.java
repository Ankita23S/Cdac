import java.util.Scanner;
import java.lang.*;
//pattern pyramid

class Sheet3_P5{

public static void main(String args[]){

int rowcount = 1;

for(int i=9; i>= 1;i--)
{

for(int j=1; j<= i*2; j++)
{
System.out.print(" ");
}
for (int j= i; j<= 9; j++)
{
System.out.print(j+" ");
}


for (int j= 9-1 ; j>= i; j--)
{
System.out.print(j+" ");
}

System.out.println();
rowcount++;
}


}
}

/*

                  9
                8 9 8
              7 8 9 8 7
            6 7 8 9 8 7 6
          5 6 7 8 9 8 7 6 5
        4 5 6 7 8 9 8 7 6 5 4
      3 4 5 6 7 8 9 8 7 6 5 4 3
    2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

*/
