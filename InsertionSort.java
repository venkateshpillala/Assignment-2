import java.util.*;
class I{
	static void insert(int a[]) {
		for(int i=0;i<a.length;i++) {
			int temp=a[i];
			int j=i-1;
			while(j>=0&&temp<=a[j]) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}
}
public class InsertionSort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size :");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array Elements :");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		I.insert(a);
		System.out.println("Array elements after sorted :");
		for(int i:a) {
			System.out.println(" "+i);
		}
		
	}

}
