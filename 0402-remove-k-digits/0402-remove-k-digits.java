class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<num.length();i++){
                char val=num.charAt(i);
            if(st.size()==0){
                st.push(val);
            }
            else{
                while(st.size()>0 && st.peek()-'0'>val-'0' && k>0){
                    st.pop();
                    k--;
                }
                st.push(val);
            
            }
        }
        StringBuilder sbr=new StringBuilder();
            while(st.size()!=0){
                if(k>0){
                    st.pop();
                    k--;
                }
                else{
                    sbr.insert(0,st.pop());
                }

            }
            while(sbr.length()>0 && sbr.charAt(0)=='0'){
                sbr.deleteCharAt(0);
            }
            return sbr.length()==0?"0":sbr.toString();
    
    }
}