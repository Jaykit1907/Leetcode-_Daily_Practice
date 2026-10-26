class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
            int ans[]=new int[temperatures.length]; 
            Stack<Integer> st= new Stack<>();
            for(int i=temperatures.length-1;i>=0;i--){
                if(st.size()==0){
                    ans[i]=0;
                    st.push(i);
                }
                else{
                    int val=temperatures[i];
                    if(val<temperatures[st.peek()]){
                        ans[i]=st.peek()-i;
                        st.push(i);
                    }
                    else{
                        while(st.size()>0 && val>=temperatures[st.peek()]){
                            st.pop();
                        }
                        if(st.size()==0){
                            ans[i]=0;
                            st.push(i);
                        }
                        else{
                            ans[i]=st.peek()-i;
                            st.push(i);
                        }
                    }
                }
            }  
            return ans;
    }
}