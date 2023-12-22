import java.util.*;
public class Duplicate {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Size :");
		int size=s.nextInt();
		int []a=new int[size];
		System.out.println("Enter Array Elements :");
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter "+(i+1)+" Element :");
			a[i]=s.nextInt();
		}
		System.out.println("Duplicate Elements in Array is : ");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]+" ");
					break;
				}
			}
		}
		

	}

}
