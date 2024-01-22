import java.util.*;
public class array {
    public static void main(String args[]){
        Integer[] arr={54,7,65,3,2,6,64,35,22}; 
        Arrays.sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println(Arrays.binarySearch(arr,6));
        int[] arr2={1,2,3,4,5};
        Arrays.fill(arr2,12); 
        for(int i:arr2){
            System.out.print(i+" ");
        }
    }

}
