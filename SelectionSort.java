import java.util.*;
class Sele{
	static void select(int a[],int n) {
		//Selection Sort
				for(int i=0;i<a.length;i++) {
					int min=i;
					for(int j=i+1;j<a.length;j++) {
						if(a[j]<a[min]) {
							min=j;
						}
					}
					int temp=a[min];
					a[min]=a[i];
					a[i]=temp;
				}
	}
}
public class SelectionSort {

	public static void main(String[] args) {
		//Create object for scanner class
		Scanner s=new Scanner(System.in);
		//Enter Array Size
		System.out.println("Enter Size of array");
		int size=s.nextInt();
		int a[]=new int[size];
		//Array Elements
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		//Invoke static object
		Sele.select(a,a.length-1);
		
		System.out.println("After sorted Array elements :");
		for(int i:a) {
			System.out.println(" "+i);
		}

	}

}
