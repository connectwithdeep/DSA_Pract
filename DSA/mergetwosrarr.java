import java.util.*;
public class mergetwosrarr {
    public static void sortedArray(int []a, int []b) {
       Set<Integer> UnionSet=new TreeSet<>();
       for(int i=0;i<a.length;i++){
           UnionSet.add(a[i]);
       }
       for(int i=0;i<b.length;i++){
           UnionSet.add(b[i]);
       }
       for(int i:UnionSet){
           System.out.print(i+" ");
       }
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        sortedArray(arr1,arr2);
        }
}