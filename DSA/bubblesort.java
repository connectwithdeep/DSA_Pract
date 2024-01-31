import java.util.*;
public class bubblesort
{
    public static void sorting(int[] arr){
        System.out.println("Bubble sort");
	    System.out.println("Array before sorting");
	    for(int i:arr){
	        System.out.print(i+" ");
	    }
	    for(int i =arr.length-1;i>0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
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