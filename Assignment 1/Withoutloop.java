import java.util.Scanner;
import java.lang.*;
//import java.lang.Integer;

class Withoutloop{

public static void main(String args[]){

//System.out.println("Enter numbers: ");
//Scanner sc = new Scanner(System.in);
//String num= sc.nextLine();

//int num=1;
Call(1);
}

public static void Call(int num)
{
if(num<=10)
{
System.out.println("printing numbers 1 to 10 : " +num);
Call(num +1);
}
}
}


//else
//System.out.println();
