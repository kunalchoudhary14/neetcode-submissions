class Solution {
    public int maxArea(int[] h) {
        int n= h.length;
        int l=0;
        int r=n-1;
        int area=0;
        int maxarea=0;
        while(l<r){
            area = Math.min(h[l],h[r]) * (r-l);
            maxarea= Math.max(maxarea, area);
            if(h[l]<=h[r]) l++;
            else r--;
        }
        return maxarea;
    }
}
