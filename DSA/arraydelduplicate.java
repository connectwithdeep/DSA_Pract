import java.util.*;
public class arraydelduplicate {
    public static void removeDuplicates(int[] arr,int n) {
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n after deletion of duplicates : ");
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        int[] arr2= new int[hs.size()];
        int index=0;
        for(int i:hs){
            arr2[index++]=i;
        }
        for(int i=0;i<hs.size();i++){
            System.out.print(arr2[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,7,1,2,1,4};
        removeDuplicates(arr, arr.length-1);
    }
}