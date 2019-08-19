/*Write a program that prints Java program to find GCD of two numbers 

Input
Line 1: First Number,N1
Line 2: Second Number,N2

Output
Display 0 (zero) if either of the inputs is zero
Otherwise, display the GCD of two numbers,
knowing that if two numbers are equally print same

Constraints
0 ≤ N1,N2 < 10000
Example
Input:
96
84

Output:
   12

Conditions
Available RAM: 512MB
Timeout: 1 seconds
The program has to read inputs from standard input
The program has to write the solution to standard output
The program must run in the test environment
*/


import java.util.Scanner;
public class MyClass
{ 
    // Recursive function to return gcd of a and b 
    static int gcd(int a, int b) 
    { 
      if(a==0)
        return b;

      if (b == 0) 
        return a; 

      return gcd(b, a % b);  
    } 
      
    // Using  Euclidean algorithm 
    public static void main(String[] args)  
    { 
        Scanner scanner = new Scanner(System.in);
        
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
         
        System.out.println(gcd(N1,N2));
         in.close();
    } 
}