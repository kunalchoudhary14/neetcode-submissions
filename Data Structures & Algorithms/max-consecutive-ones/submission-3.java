class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int c=0;
        int maxc=0;
        for(int i:nums){
            if(i==1) c++;
            else c=0;
            maxc= Math.max(maxc,c);
        }
        
        return maxc;
    }
}