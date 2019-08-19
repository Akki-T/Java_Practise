/*Temperatures
In this exercise, you have to analyze records of temperature to find the closest to zero.

Sample temperatures

Write a program that prints the temperature closest to 0 among input data.

Input
Line 1: N, the number of temperatures to analyse
Line 2: The N temperatures expressed as integers ranging from -273 to 5526
Output
Display 0 (zero) if no temperature is provided
Otherwise, display the temperature closest to 0,
knowing that if two numbers are equally close to zero,
positive integer has to be considered closest to zero
(for instance, if the temperatures are -5 to 5, then display 5)
Constraints
0 ≤ N < 10000
Example
Input:

    5
    1 -2 -8 4 5

Output:
    1

Conditions
Available RAM: 512MB
Timeout: 1 seconds
The program has to read inputs from standard input
The program has to write the solution to standard output
The program must run in the test environment
*/



import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
     
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
     
	if(n==0){
	System.out.println(0);
	in.close();
	}
	
      Integer closest=null;
      
      for(int i = 0; i < n; i++) {
			int current = in.nextInt();
			if(closest == null || Math.abs(closest) > Math.abs(current) || Math.abs(closest) == Math.abs(current) && closest < current) 
					closest = current;
		}
		System.out.println(closest);
in.close();
       
    }
}