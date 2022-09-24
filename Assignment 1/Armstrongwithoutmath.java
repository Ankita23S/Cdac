import java.util.Scanner;
import java.lang.*;
class Armstrongwithoutmath{

public static void main(String args[]){

int temp,mul,flag;
int sum=0;
int count=0;

System.out.println("Enter the number");
Scanner sc = new Scanner(System.in);
int num= sc.nextInt();

temp = num;
for(;temp>0;)
{
temp=temp/10;
count++;
}
System.out.println("Number of digits are " +count);
temp=num;
//153
while(temp>0)
{
mul=temp%10;
// mul =remainder .. 3 ..5 ..1

temp=temp/10;
// number divided by 10 (3 times one by one)gives single digits ..15 ..1..0

flag=1;
//flag is storing multiplication so initially = 1

for(int i=count;i>=1;i--)
//i=count=3 & post decrement 3 to 1 for 153

{
flag=flag*mul;
// first remainder cubes are taken ..final cube value taken for each digit
//for first iteration : mul is =3 for above first mul value  //for count =3
//flag=1*3 ..flag =3
//flag=3*3 ..flag =9
//flag=9*3 ..flag =27 --> taken in sum

//for second iteration mul=5 //for count =2
//flag=1*5 ..flag =5
//flag=5*5 ..flag =25
//flag=25*5 ..flag =125  --> taken in sum

//for third iteration mul=1 //for count=1
//flag=1*1 ..flag =1
//flag=1*1 ..flag =1
//flag=1*1 ..flag =1  --> taken in sum

//after third iteration it exits flag codition loop

}
sum=sum+flag;

//sum=0+27 .. =27
//sum=27+125 .. =152
//sum=152+1 .. =153

}
//after third iteration count =0 it exits  loop

if(sum==num)
System.out.println("It is an Armstrong number ");
else
System.out.println("It is not an Armstrong number ");
}
}


/*
originalNumber = num;
for(;originalNumber !=0; originalNumber /= 10)
{
remainder = originalNumber % 10;
result += Math.pow(remainder, n);
}
if(result == num)


}
}
*/