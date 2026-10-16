class Solution {
    public boolean canBeValid(String s, String locked) {

        int n=s.length();
        if(n%2!=0){
            return false;
        }

        Stack<Integer> st=new Stack<>();
        Stack<Integer> unlock=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char val=locked.charAt(i);
            if(val=='0'){
                unlock.push(i);
                }
            else if(ch=='('){
                st.push(i);
            }
            else{
                if(st.size()>0){
                    st.pop();
                }
                else if(unlock.size()>0){
                    unlock.pop();
                }
                else{
                    return false;
                }
            }
        }


        while(st.size()>0 && unlock.size()>0 && st.peek()<unlock.peek() ){
            unlock.pop();
            st.pop();
        }



        return st.size()==0?true:false;

    }
}