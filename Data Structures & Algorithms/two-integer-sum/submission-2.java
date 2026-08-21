class Solution {
    public int[] twoSum(int[] nums, int t) {
        // Map<Integer,Integer> mp = new HashMap<>();
        // // for(Integer i: nums){
        // //     mp.merge(i, 1, Integer::sum)
        // // }
        // for(int i =0;i<nums.length;i++){
        //     int rem = target-nums[i];
        //     if(mp.containsKey(rem)){
        //         // return new int{i,mp.get(rem)} ;
        //         return new int[]{mp.get(rem), i};
        //     }
        //     mp.put(nums[i],i);
        // }
        // return new int[]{-1,-1};
        
        // two pointer
       
        // int l=0;
        // int r=nums.length-1;
        // Arrays.sort(nums);
        
        // while(l<r){
        //     if(nums[l]+nums[r]==t){
        //         return new int[] {l,r};
        //     }
        //     else if(nums[l]+nums[r]<t) l++;
        //     else r--;
        // }

        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int rem = t-nums[i];
            if(mp.containsKey(rem)){
                return new int []{mp.get(rem),i};
            }
            mp.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}
