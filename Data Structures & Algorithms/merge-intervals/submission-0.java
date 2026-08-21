class Solution {
    public int[][] merge(int[][] a) {
        int n = a.length;
        Arrays.sort(a, Comparator.comparingInt(x -> x[0]));
        // Arrays.sort(a, Comparator.comparingInt(x->x[0]));
        List<List<Integer>> ans = new ArrayList<>();

        for (int i=0;i<n;i++){
            if(ans.isEmpty() || ans.get(ans.size()-1).get(1)<a[i][0]){
                List<Integer> temp = new ArrayList<>();
                temp.add(a[i][0]);
                temp.add(a[i][1]);

                ans.add(temp);
            }
            else{
                List<Integer> last = ans.get(ans.size()-1);
                last.set(1,Math.max(a[i][1],last.get(1)));
            }
        }

        // return new int[ans.size()][2] ans;
        int[][] result = new int[ans.size()][2];

        for (int i = 0; i < ans.size(); i++) {
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }

        return result;
    }
}
