package smallestAndLargest;
import java.util.Scanner;
public class SmallestLargest {

	public static void main(String[] args) {

		int i,n,large,small;
		Scanner sc=new Scanner(System.in); //used to read from keyboard

		System.out.print("Enter the number pf Elements: ");
		n=sc.nextInt();
		int a[]=new int[n];


		System.out.print("Enter elements of array: ");
		for(i=0;i<n;++i)
		a[i]=sc.nextInt();

		large=small=a[0];
		for(i=1;i<n;++i)
		{
		if(a[i]>large)
		large=a[i];
		if(a[i]<small)
		small=a[i];
		}

		System.out.print("Smallest Element:"+small);
		
		System.out.println("Largest Element:"+large);
		}
		}

