import java.util.*;
class A{
	static int partition(int a[],int start,int end) {
		int i=start-1;
		int pivot=a[end];
		for(int j=start;j<end;j++) {
			if(pivot>a[j]) {
				i++;
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[end];
		a[end]=temp;
		return (i+1);
	}
	
	static void quick(int a[],int start,int end) {
		int i=start,j=end;
		if(i<j) {
			int p=partition(a,start,end);
			quick(a,start,p-1);
			quick(a,p+1,end);
		}
	}
}
public class QuickSort
{
	public static void main(String[] args) {
		 
	}
}
