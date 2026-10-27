class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            if(st.size()==0){
                st.push(num.charAt(i));
            }
            else{
                while(k>0 && st.size()>0 && num.charAt(i)<st.peek()){
                    st.pop();
                    k--;
                }
                st.push(num.charAt(i));
            }
        }
                StringBuilder sbr=new StringBuilder();
        while(st.size()>0){
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