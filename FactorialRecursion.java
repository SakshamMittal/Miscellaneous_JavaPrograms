import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FactorialRecursion{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(Factorial(N));
	}
    public static int Factorial(int N){
            if(N<=1)
            	return 1;
            else{
                return N*Factorial(N-1);
            }
	}
}