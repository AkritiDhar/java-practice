package oopspackage.one;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcept {
	public static void main(String[] args) {
		
		int arr1 [] = {20,30,10,100,100};
		System.out.println(arr1[0]);
		System.out.println(arr1.length);
		System.out.println("*********");
		
		Scanner sc = new Scanner(System.in);
		int arr2Size = sc.nextInt();
		int arr2[] = new int[arr2Size];
		
		for(int i=0;i<arr2Size;i++){
			arr2[i]=sc.nextInt();
		}
		System.out.println(arr2.length);
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}

}
