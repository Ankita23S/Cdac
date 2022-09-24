import java.lang.*;
import java.util.*;

class Swap{
public static void main(String args[]){
System.out.println("Enter first number A = "); 
 
Scanner sc= new Scanner(System.in);
int num1= sc.nextInt();
System.out.println("Enter Second number B = ");
System.out.println();
int num2= sc.nextInt();
int c = num1 + num2 ;
num2 = c- num2;
System.out.println("Numbers after swapping : ");
System.out.println();
System.out.println("B =  "+num2);
num1 = c-num2 ;
System.out.println("A =  "+num1);

}
}

/*
two approach

1.third variable

a,b & temp
1. store a in temp : temp = a
2. put value of b to a : a=b ..1st swap done
3. put value of temp in b which has value of initial a
   b = temp .. b=a ..second swap done

2. Addition
a+b=c
10+25=35 .. c=35
b=c-b.. b= 35-25=10 ..1st swap done
a= c-b .. a= 35 - 10 = 25 ..2ns swap done

(a=15 + b=5) c= 20
b=20 - 5 = 15
a= 20 - 15 = 5
*/