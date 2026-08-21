class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        // for(Integer i: nums){
        //     mp.merge(i, 1, Integer::sum)
        // }
        for(int i =0;i<nums.length;i++){
            int rem = target-nums[i];
            if(mp.containsKey(rem)){
                // return new int{i,mp.get(rem)} ;
                return new int[]{mp.get(rem), i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
