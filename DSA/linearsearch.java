public class linearsearch {
    public static void linsearch(int []arr,int ele){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                System.out.println("The element is at "+i+" index");
                return;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,6,3,5};
        int element=5;
        linsearch(arr,element);
    }
}
