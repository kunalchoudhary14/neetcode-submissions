class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        int c=1;
        int el=nums[0];
        for(int i=1;i<n;i++){
            if(c==0){
                el=nums[i];
            }
            if(nums[i]==el){
                c++;
            }
            else{
                c--;
            }
        }
        c=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el) c++;
        }
        if(c>n/2) return el;
        return -1;
    }
}