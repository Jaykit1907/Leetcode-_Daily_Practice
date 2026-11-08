class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            if(st.size()==0){
                st.push(nums2[i]);
                map.put(nums2[i],-1);
            }
            else{
                int val=nums2[i];
                if(val<st.peek()){
                    map.put(val,st.peek());
                    st.push(val);
                }
                else{
                    while(st.size()>0 && st.peek()<=val){
                        st.pop();
                    }
                    if(st.size()==0){
                        map.put(val,-1);
                        
                    }
                    else{
                        map.put(val,st.peek());
                    }
                    st.push(val);
                }
            }
        }
        int ans[]=new int[nums1.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}