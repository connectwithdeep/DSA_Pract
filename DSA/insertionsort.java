import java.util.*;
public class insertionsort
{
    public static void sorting(int[] arr){
        System.out.println("Isnsetion sort");
	    System.out.println("Array before sorting");
	    for(int i:arr){
	        System.out.print(i+" ");
	    }
	    for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
	    System.out.println("");
	    System.out.println("Array after sorting :");
	   for(int i:arr){
	       System.out.print(i+" ");
	   }
    }
	public static void main(String[] args) {
		System.out.print("Enter size of array ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
        System.out.println("Enter elements of array ");
		for(int i=0; i<n;i++){
		    arr[i]=sc.nextInt();
		}
		sorting(arr);
	}

}