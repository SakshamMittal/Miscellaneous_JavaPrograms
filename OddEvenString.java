import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OddEvenString{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String str;
        char odd[]=new char[10000];
        char even[]=new char[10000];
        int x=0,z=0;
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++){
            str=sc.next();
            for(int j=0;j<str.length();j+=2){
                odd[z++]=str.charAt(j);
            }
            for(int l=1;l<str.length();l+=2){
                even[x++]=str.charAt(l);
            }
            for(int a=0;a<(str.length()+1)/2;a++){
                System.out.print(odd[a]);
            }
            System.out.print(" ");
            for(int b=0; b<str.length()/2;b++){
                System.out.print(even[b]);
            }
            z=0;x=0;
            System.out.println();
           }
    }
}