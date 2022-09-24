import java.util.Scanner;

class Printevenseries{

public static void main(String args[]){

System.out.println("Enter number upto which you want to print even series: ");
Scanner sc = new Scanner(System.in);
int num= sc.nextInt();

for(int i=2; i<=num; i++)
{
if(i%2==0)
//we are running loop and cheching every number from '0' upto that number
// when divided by 2 if has remainder 0 than will print it in even series
{
System.out.print(" "+i+" ");
}
}
if(num<=0)
{
System.out.println("Give positive number ");
}

}
}