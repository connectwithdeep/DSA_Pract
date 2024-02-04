public class singleelement {
    public static int sinelement(int [] arr){
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        System.out.println(xor);
        return xor;

    }
    public static void main(String[] args) {
        int [] arr={1,1,2,3,4,5,6,3,4,5,6};
        sinelement(arr);
    }
}
