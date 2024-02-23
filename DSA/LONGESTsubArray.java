import java.util.*;
public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int len=0;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                        sum+=a[j];
            
            if(sum==k)
                  len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }
}
