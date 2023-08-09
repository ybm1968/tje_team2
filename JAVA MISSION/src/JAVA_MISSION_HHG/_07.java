package JAVA_MISSION_HHG;

import java.util.Iterator;
import java.util.Scanner;

public class _07 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				
				if(arr[i] < arr[j]) {
				    int temp = arr[i];
				    arr[i] = arr[j];
				    arr[j] = temp;
				
			}
			
		}
		
		}
		
	 for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	 System.out.println();
	 
	 for (int i = 0; i < arr.length; i++) {
		 for (int j = 0; j < arr.length; j++) {
			 
			 if(arr[i] > arr[j]) {
				 int temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;
				 
			 }
			
		 }
	
	 }
	 for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	 
	 sc.close();
	}
}


