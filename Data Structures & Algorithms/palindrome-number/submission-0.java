class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int d=0;
        int n=x;
        int rev=0;
        while(x>0){
            d=x%10;
            rev=rev*10 +d;
            x=x/10;
        }
        return (n==rev);
    }
}