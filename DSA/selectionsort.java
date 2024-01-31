public class selectionsort{
    public static void selsort(int []arr){
       System.out.println("Selection Sort");
       System.out.println("Before Sorting");
       for(int i:arr){
        System.out.print(i+" ");
       }
        for(int i=0;i<arr.length-1;i++){
           int min=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[min]){
                min=j;
                }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("");
        System.out.println("After Sorting");
        for(int i:arr){
         System.out.print(i+" ");
        }
    }
    public static void main(String []args){
        int [] arr={6,3,41,6,98,1,2,4};
        selsort(arr);
    }
}
