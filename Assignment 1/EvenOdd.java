import java.util.Scanner;

class EvenOdd{

public static void main(String args[]){

System.out.println("Enter number: ");
Scanner sc = new Scanner(System.in);
int num= sc.nextInt();
if (num%2 == 0)
{
System.out.println("Number is even ");
}
else
{
System.out.println("Number is odd ");
}
System.out.println("Enter double number: ");
Scanner sc1 = new Scanner(System.in);
double num2= sc1.nextDouble();
if (num2%2 == 0)
{
System.out.println("Number is even ");
}
else
{
System.out.println("Number is odd ");
}

}
}