//Balancing Parenthesis: Given a string of parenthesis you have to print the minimum number of deletions that can be made so to balance the parenthesis

public class MyClass {
    public static void main(String args[]) {
       String s="(()))()";
       int n=s.length();
       int o=0;
    for(int i=0;i<n;i++)
    {
        if(s.charAt(i)==')')
        o--;
        else if(s.charAt(i)=='(')
        o++;
       
    }
     
     System.out.println("the minimum number of deletions to balance the parenthesis : "+Math.abs(o));
}
}
