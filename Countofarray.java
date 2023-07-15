package count_of_array_elements;

import java.util.Scanner;

public class Countofarray{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int arrsize = scanner.nextInt();
		System.out.println("Enter array elements");
		int arr[] = new int[arrsize];
		for(int i=0;i<arrsize;i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.print(element_counter(arr,arrsize));
			
		}
	static int element_counter(int arr[],int arrsize) {
		int count=0;
		int max=arr[0];
		System.out.println(max);
		for(int i=0;i<arrsize;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
		for(int i=0;i<arrsize;i++) {
			if(max>arr[i]) {
				count++;
			}
		}
		return count;
		
	}
	
	}
