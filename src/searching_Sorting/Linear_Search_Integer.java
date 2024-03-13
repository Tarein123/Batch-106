package searching_Sorting;

import java.util.Scanner;

public class Linear_Search_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a= {45,35,20,78,90,60,65,15,14,85};
		System.out.print("Enter search data : ");
		int data=sc.nextInt();
		search(a,data);
		
		

	}

	public static void search(int[] a, int data) {
		// TODO Auto-generated method stub
		int i;
		for (i=0; i<a.length; i++) {
			if (a[i]==data) {
				System.out.print(data+ " is dound at "+i);
				break;
			}
		}
		if(i==a.length) {
			System.out.print(data+" is not found in a given array.");
		}
		
	}

}
