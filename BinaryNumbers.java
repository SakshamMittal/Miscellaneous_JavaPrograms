import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BinaryNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[100];
        int i=0;
        while(n>=1){
			arr[i++]=n%2;
			n=n/2;

			}
		int largest=0,count=0;
		for(int j=0;j<100;j++){
			if(arr[j]==1)
			count++;
			else{
				if(count>largest)
				largest=count;
				count=0;
			}
		}
		System.out.println(largest);
	}

}