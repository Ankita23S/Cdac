
import java.lang.*;
import java.util.*;

class Reverseno{
public static void main(String args[]){
System.out.println("Enter the number for printing digits : ");
Scanner sc= new Scanner(System.in);
int num= sc.nextInt();

while(num>0 || num<0)
{
if(num>0)
{
System.out.print("  "+(num%10));
num=num/10;
}
else
{

System.out.print("  "+(num%10));
num=(-1)*(num/10);

}
}

}
}
