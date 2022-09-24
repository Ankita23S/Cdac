import java.util.Scanner;
import java.lang.*;

class FactorsQ9{

public static void main(String args[]){

System.out.println("Enter number: ");
Scanner sc = new Scanner(System.in);
int num= sc.nextInt();

int i=1;
if(num<0)
{
System.out.println("Invalid");
};

while(i<=num)
{
if(num%i==0)
{

System.out.println("Factors of given number are : " +i);
}
i++;
}


}
}