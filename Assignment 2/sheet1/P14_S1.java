import java.util.Scanner;
import java.lang.*;
//import java.math.*;
// LHS upper triangular matrix for i & j

class P14_S1{

public static void main(String args[]){


for(int i=5;i>=1;i--)
{

for(int j=1; j<=i; j++)

{

//System.out.print(i+ "  ");
System.out.print(j+ "  ");

}

System.out.println();
}


}
}

/*
for i: 
5  5  5  5  5
4  4  4  4
3  3  3
2  2
1

for j:
1  2  3  4  5
1  2  3  4
1  2  3
1  2
1

*/