class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){

            int val=nums2[i];
            if(st.isEmpty()){
                st.push(nums2[i]);
                map.put(val,-1);
            }
            else{
                if(val<st.peek()){
                    map.put(val,st.peek());
                    st.push(nums2[i]);
                }
                else{
                    while(st.size()>0 && val>=st.peek()){
                        st.pop();
                    }
                    if(st.size()==0){
                       map.put(val,-1);
                        st.push(nums2[i]);
                    }
                    else{
                       map.put(val,st.peek());
                        st.push(nums2[i]);
                    }
                }
            }
        }
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}