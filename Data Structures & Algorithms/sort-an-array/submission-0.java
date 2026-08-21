class Solution {
    public void merge(int[] nums, int l, int m, int h){
        List<Integer> temp = new ArrayList<>();

        int left =l;
        int right = m+1;

        while(left<=m && right<=h){
            if(nums[left]<=nums[right]) temp.add(nums[left++]);
            else temp.add(nums[right++]);
        }
        while(left<=m) {
            temp.add(nums[left++]);
        }
        while(right<=h) {
            temp.add(nums[right++]);
        }
        for(int i=l;i<=h;i++){
            nums[i]= temp.get(i-l);
        }
    }

    public void mergesort(int[] nums, int l, int h){
        if(l>=h) return;
        int m = l+(h-l)/2;
        mergesort(nums,l,m);
        mergesort(nums,m+1,h);
        merge(nums,l,m,h);

    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int l=0;
        int h=n-1;
        mergesort(nums,l,h);

        return nums;
    }
}