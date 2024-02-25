public class array_arrange {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
int neg=1;int pos=0;
int []ans= new int[a.length];
for(int i=0;i<a.length;i++){
    if(a[i]<0){
        ans[neg]=a[i];
        neg+=2;
    }
    else{
        ans[pos]=a[i];
        pos+=2;
    }
}
return ans;
    }
}