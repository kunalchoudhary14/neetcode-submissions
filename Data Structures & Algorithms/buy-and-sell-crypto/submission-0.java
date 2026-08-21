class Solution {
    public int maxProfit(int[] p) {
        int maxp=0;
        int minn=p[0];
        for(int i=0;i<p.length;i++){
            maxp= Math.max(maxp, p[i]-minn);
            minn = Math.min(minn,p[i]);
        }
        return maxp;
    }
}
