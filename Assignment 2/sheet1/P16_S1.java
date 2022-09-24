import java.util.Scanner;
import java.lang.*;

//Lower LHS starting with 5

class P16_S1{

public static void main(String args[]){

for(int i=5;i>=1;i--)

{

for(int j=5; j>=i; j--)

{
//System.out.print(" "+i);

System.out.print(" "+j);


}

System.out.println();
}

}
}

/*

for j:
5
54
543
5432
54321

for i:
5
44
333
2222
11111


*/