class Solution {
    public int maxSubArray(int[] nums) {
        int n= nums.length;
        int sum=0;
        int maxs=Integer.MIN_VALUE;
        int l=0;

        for(int i=0;i<n;i++){
            sum = sum+nums[i];
            maxs=Math.max(maxs, sum);
            if(sum<0){
                sum=0;
            }
        }
        // while(l<n){
        //     sum
        // }

        // for(int i=0;i<n;i++){
        //     sum=0;
        //     for(int j=i;j<n;j++){
        //         sum=sum+nums[j];
        //     }
        //     maxs = Math.max(maxs, sum);
        // }
        return maxs;
    }
}
