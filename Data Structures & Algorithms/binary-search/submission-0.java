class Solution {
    public int search(int[] nums, int t) {
        int n= nums.length;
        int l=0;
        int h=n-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[mid]==t) return mid;
            else if(nums[mid]>t){
                
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
}
