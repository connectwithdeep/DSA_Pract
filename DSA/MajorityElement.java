public class Solution {
    public static int majorityElement(int []v) {
        // Write your code here
  
        for(int i=0;i<v.length;i++){
                  int count=0;
            for(int j=0;j<v.length;j++){
                if(v[j]==v[i]){
                    count ++;}
            }
            if(count>v.length/2){
            return v[i];
        }

        }
        return -1;
    }
}
