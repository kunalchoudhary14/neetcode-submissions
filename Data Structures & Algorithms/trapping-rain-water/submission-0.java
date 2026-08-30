class Solution {
    public int trap(int[] h) {
        int total =0;
        int n = h.length;
        int lm=0;
        int rm=h[n-1];
        int[] sf = new int[n];
        for(int i=n-1;i>=0;i--){
            rm=Math.max(h[i],rm);
            sf[i]= rm;

        }
        for(int i=0;i<n;i++){
            lm=Math.max(h[i],lm);
            total+=Math.min(lm,sf[i])-h[i];
        }


        return total;
    }
}
