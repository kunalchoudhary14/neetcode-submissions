class Solution {
    public void merge(int[] nums, int l,int m, int h){
        List<Integer> tmp = new ArrayList<>();
        int left =l;
        int right= m+1;

        while(left <= m && right <= h){
            if(nums[left]<nums[right]) tmp.add(nums[left++]);
            else tmp.add(nums[right++]);
        }
        while(left <= m) tmp.add(nums[left++]);
        while(right <= h) tmp.add(nums[right++]);

        for (int i=l;i<=h;i++){
            nums[i]= tmp.get(i-l);
        }

    }
    public void mergesort(int[] nums, int l, int h){
        if(l>=h) return;
        int m = l+(h-l)/2;
        mergesort(nums, l ,m);
        mergesort(nums, m+1 ,h);
        merge(nums, l ,m,h);

    }
    public List<List<Integer>> threeSum(int[] nums) {
        // int n = nums.length;
        // Arrays.sort(nums);
        // List<List<Integer>> ans = new ArrayList<>();
        // // Map<Integer, Integer> mp = new HashMap<>();
        // for (int i = 0; i < n - 2; i++) {
        //     if (i > 0 && nums[i] == nums[i - 1])
        //         continue;
        //     int l = i + 1;
        //     int r = n - 1;
        //     while (l < r) {
        //         int sum = nums[i] + nums[l] + nums[r];
        //         if (sum == 0) {
        //             ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    
        //             while (l < r && nums[l] == nums[l + 1]) {
        //                 l++;
        //             }
        //             while (l < r && nums[r] == nums[r - 1]) {
        //                 r--;
        //             }
        //             l++;
        //             r--;
        //         }
        //         else if (sum > 0)
        //             r--;
        //         else
        //             l++;
        //     }
        // }
        List<List<Integer>> ans = new ArrayList<>();
        int n= nums.length;
        int l=0;
        int h=n-1;
        mergesort(nums,l,h);
    // Arrays.sort(nums);
        for (int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;

            }
            int j= i+1;
            int k=n-1;
            while(j<k){
                
                if(nums[i]+nums[j]+nums[k]==0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k && nums[j]==nums[j+1]) j++;
                    while(j<k && nums[k]==nums[k-1]) k--;
                    j++;
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k]<0){
                    j++;

                }
                else k--;
            }
        }


        return ans;
    }
}
