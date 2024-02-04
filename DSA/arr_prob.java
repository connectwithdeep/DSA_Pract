class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                
            }
            else{
                count=0;
            }
            maxi=Math.max(maxi,count);
        }
        return maxi;
    }
  public int missingNumber(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        for(int i=0;i<nums.length+1;i++){
            if(!s.contains(i)){
                return i;
            }
        }
        return -1;
    }

}
