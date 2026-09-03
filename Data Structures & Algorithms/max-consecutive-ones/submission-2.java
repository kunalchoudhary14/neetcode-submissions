class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int c=0;
        int maxc=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1) c++;
            else c=0;
            maxc= Math.max(maxc,c);
        }
        
        return maxc;
    }
}