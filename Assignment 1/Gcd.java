import java.util.Scanner;
import java.lang.*;

class Gcd{

public static void main(String args[]){

System.out.println("Enter number: ");
Scanner sc = new Scanner(System.in);
int num1= sc.nextInt();
System.out.println("Enter number: ");
int num2= sc.nextInt();
int gcd =1;
if(num1<0 || num2 <0)
{
System.out.println("Invalid");
};

for(int i = 1; (i<=num1 && i<=num2) ; i++)
// staring from 1 upto number we will divide it to find factors
{
if(num1%i==0 && num2%i==0)
// starting from 1 if both number are divisible by same highest "i" value 
// then it is GCD
gcd=i;
}
System.out.println("The GCD is :  "+gcd);


}
}