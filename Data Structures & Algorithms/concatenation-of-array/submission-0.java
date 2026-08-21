class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int[] muns = new int[2*n];
        for(int i=0;i<n;i++){
            muns[i]=nums[i];
        }
        for(int i=0;i<n;i++){
            muns[n+i]=nums[i];
        }
        return muns;
    }
}