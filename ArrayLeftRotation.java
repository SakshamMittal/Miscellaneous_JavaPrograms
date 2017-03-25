import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class ArrayLeftRotation{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int d = sc.nextInt();
	int arr[] = new int[n];
	int temp;
	for(int i=0; i<n; i++)
	arr[i] = sc.nextInt();
	for(int j=0; j<d; j++){

		temp=arr[0];
		for(int k=0;k<n-1;k++){
			arr[k]=arr[k+1];
		}
		arr[n-1]=temp;
	}
	for(int l=0;l<n;l++)
	System.out.print(arr[l]+" ");
	}
}

/* This program could also be done linearly

		KEEP THIS SOLUTION IN MIND

	int[] getArray = new int[n];
    for (int i = 0; i < n; i++) {
        getArray[i] = scan.next();
    }
    for (int i = 0; i < n; i++) {
        array[(i + n - d) % n] = getArray [i];
    }
    for(int i = 0; i < n; i++) {
        System.out.print(array[i] + " ");
    }
*/
