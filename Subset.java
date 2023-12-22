import java.util.*;

public class Subset {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size :");
		int n=s.nextInt();
		int []a= new int[n];
		System.out.println("Enter Array values :");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Enter Subset array size");
		int sub=s.nextInt();
		int subset[]=new int[sub];
		if(a.length>subset.length) {
		System.out.println("Enter subset array values :");
		for(int i=0;i<subset.length;i++) {
			subset[i]=s.nextInt();
		}
		int count=0;
		for(int i=0;i<subset.length;i++) {
			for(int j=0;j<subset.length;j++) {
				if(a[i]==a[j])
					count++;
			}
		}
		if(count>0) {
			System.out.println("It's a subset");
		}
		else {
			System.out.println("Not a subset");
		}
		}
		else {
			System.out.println("subset array length is must less than first array");
		}
	}

}
