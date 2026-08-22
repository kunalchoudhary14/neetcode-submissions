class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        int maxp=nums[0];
        int p=1;
        
        for(int i=0;i<n;i++){
            p=p  * nums[i];
            maxp = Math.max(maxp,p);
            if(p==0) {
                p=1;
                }
            
        }
        p=1;
        for(int i=n-1;i>=0;i--){
            p=p  * nums[i];
            maxp = Math.max(maxp,p);
            if(p==0) {
                p=1;
                }
            
        }
        
return maxp;


    }
}
