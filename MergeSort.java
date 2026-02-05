/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class MergeSort
{
    public static void merge(int arr[]){
        int n=arr.length;
        if(n==1) return;
        int a[]=new int[n/2];
        int b[]=new int[n-n/2];
        int idx=0;
        for(int i=0;i<a.length;i++){
            a[i]=arr[idx++];
            }
        
        for(int i=0;i<b.length;i++){
            b[i]=arr[idx++];
            }
        merge(a);
        merge(b);
        mer(a,b,arr);
    }
    
    public static void mer(int a[],int b[],int c[]){
        int idx=0;
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[idx++]=a[i];
                i++;
            }
            else{
                c[idx++]=b[j];
                j++;
            }
            
        }
        while(i<a.length) c[idx++]=a[i++];
        while(j<b.length) c[idx++]=b[j++];
    }
    
	public static void main(String[] args) {
		int arr[]={-4,2,3,1,7,6,9};
		merge(arr);
		for(int ele:arr){
		    System.out.print(ele+" ");
		}
	}
}