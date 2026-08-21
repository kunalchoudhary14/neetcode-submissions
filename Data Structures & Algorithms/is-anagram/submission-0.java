class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        for (char item : s.toCharArray()) {
            m1.merge(item, 1, Integer::sum);
        }
        for (char item : t.toCharArray()) {
            m2.merge(item, 1, Integer::sum);
        }
        // for(int i=0;i<n;i++){

        // }
        // for(int i=0;i<n;i++){
            
        // }
        return m1.equals(m2);
    }
}
