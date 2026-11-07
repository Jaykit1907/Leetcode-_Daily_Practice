class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        list.add(1);
        ans.add(list);
        for(int i=1;i<numRows;i++){
            List<Integer> prev=ans.get(i-1);

            int j=1;
            List<Integer> list1=new ArrayList<>();
            list1.add(1);
            while(j<prev.size()){
                    list1.add(prev.get(j) + prev.get(j-1));
                    j++;
            }
            list1.add(1);
            ans.add(list1);
        }
        return ans;
    }
}