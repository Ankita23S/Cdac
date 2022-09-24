import java.util.Scanner;
import java.lang.*;
//import java.math.*;
// LHS upper triangular matrix for i & j

class P18_S1{

public static void main(String args[]){


for(char i='E';i>='A';i--)
{

for(char j='A'; j<=i; j++)

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
E  E  E  E  E
D  D  D  D
C  C  C
B  B
A

for j:
A  B  C  D  E
A  B  C  D
A  B  C
A  B
A

*/