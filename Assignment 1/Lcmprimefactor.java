import java.lang.*;
import java.util.*;


public class Lcmprimefactor {
    // method to calculate greater number
public static int largerNum(int n1, int n2) {
if (n1 > n2) {
 return n1;
} 
else {
 return n2;
}
}
   // method returns lcm of two numbers

public static int getLcm(int n1, int n2, int lcm) {
if (n1 == 1 && n2 == 1) {
 return lcm;
}
int ans = 1;
        // iterating and considering prime factors

for (int i = 2; i <= largerNum(n1, n2); i++) {
if (n1 % i == 0 || n2 % i == 0) 
{
if (n1 % i == 0) 
{
n1 = n1 / i;
}
if (n2 % i == 0) 
{
n2 = n2 / i;
}
ans = getLcm(n1, n2, lcm * i);
break;
}
}
return ans;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number : ");
int n1 = sc.nextInt();
System.out.println("Enter second number : ");
int n2 = sc.nextInt();
int lcm = getLcm(n1, n2, 1); // calling getLcm method
System.out.println("The LCM of " + n1 + " and " + n2 + " is " + lcm); // printing result
    }
}
