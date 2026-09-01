class Solution {
    public void reverse(int[] a, int i,int j){
        // int i=0;
        // int j =a.length-1;
        while(i<j){
            int temp = a[j];
            a[j]=a[i];
            a[i]=temp;
            i++;
            j--;
        } 
    }
    public boolean check(int[] nums) {
        int k=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                k=i+1;
                break;
            }
        }
        reverse(nums, 0, k-1);
        reverse(nums, k,n-1);
        reverse(nums,0,n-1);

       for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
    return true;
    }
}