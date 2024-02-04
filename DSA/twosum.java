public class twosum {
    public static String read(int []arr, int target){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target){
                System.out.println(i+" and "+j);
                return "YES";
                
            }
        }
    }
            return "NO";
        }    
        public static void main(String[] args) {
            int []arr={2,3,4,1,5,3,9,4,14,5,6,8};
            String a=read(arr,16);
            System.out.println(a);
        }
}
