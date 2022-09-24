
import java.lang.*;
import java.util.*;

class Palindrome{
public static void main(String args[]){
System.out.println("Enter a positive number: ");
Scanner sc= new Scanner(System.in);
int num= sc.nextInt();
int temp =num;
int sum=0;

while(num>0)
{
int rem= (num%10);
sum=((sum*10)+rem);
num=num/10;
}
if (temp==sum)
{
System.out.println("Ii is a Palindrome number ");

}

else
{
System.out.println("Ii is a not Palindrome number ");
}


}
}
