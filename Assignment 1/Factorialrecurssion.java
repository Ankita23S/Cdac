import java.util.Scanner;
import java.lang.*;

class Factorialrecurssion{

static int factorial(int n){
if(n==0)
return 1;
else 
return (n*factorial(n-1));
}


public static void main(String args[]){

int i,fact=1;

System.out.println("Enter number: ");
Scanner sc = new Scanner(System.in);
int num= sc.nextInt();

if(num<0)
{
System.out.println("Invalid");
}

fact=factorial(num);

System.out.println("Factorial of given number is : " +fact);


}
}