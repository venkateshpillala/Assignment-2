import java.util.*;
class Sort{
	void merge(int a[],int start,int mid ,int end) {
		int n1=mid-start+1;
		int n2=end-mid;
		int[] L=new int[n1];
		int[] R=new int[n2];
		for(int i=0;i<n1;i++) {
			L[i]=a[start+i];
		}
		for(int j=0;j<n2;j++) {
			R[j]=a[mid+1+j];
		}
		int i=0,j=0,k=start;
		while(i<n1&&j<n2) {
			if(L[i]<=R[j]) {
				a[k]=L[i];
				i++;
			}
			else {
				a[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<n2) {
			a[k]=R[j];
			j++;
			k++;
		}
	}
	void mergeSort(int a[],int start,int end) {
		if(start<end) {
			int mid=(start+end-1)/2;
			mergeSort(a,start,mid);
			mergeSort(a,mid+1,end);
			merge(a,start,mid,end);
		}
	}
}
public class MergeSort {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter array size :");
	int n=s.nextInt();
	int a[]=new int [n];
	System.out.println("Enter array values :");
	for(int i=0;i<a.length;i++) {
		a[i]=s.nextInt();
	}
	Sort sort=new Sort();
	sort.mergeSort(a, 0, a.length-1);
	for(int i:a) {
		System.out.print(i+" ");
	}
	
}
}
