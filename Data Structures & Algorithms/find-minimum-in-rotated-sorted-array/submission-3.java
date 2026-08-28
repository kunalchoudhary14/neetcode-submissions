class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int res = nums[0];
        int l =0;
        int h=n-1;
        while(l<=h){
            if(nums[l]<=nums[h]){
                res = Math.min(res, nums[l]);
                break;
            }
            int m = l+(h-l)/2;
            res = Math.min(res, nums[m]);
            
            if(nums[m]>=nums[l]){
                l=m+1;
            }
            else h=m-1;
        }

        // for(int i=1;i<n;i++){
        //     if(nums[i]<nums[i-1]) return nums[i];
        // }
        return res;
    }
}
