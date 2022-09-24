import java.util.Scanner;
import java.lang.*;

class Printwithoutloop{

public static void function(int n)
{
if(n<=10)
{
System.out.println(n);
function(n+1);
}
}

public static void main(String args[]){

function(1);

}
}