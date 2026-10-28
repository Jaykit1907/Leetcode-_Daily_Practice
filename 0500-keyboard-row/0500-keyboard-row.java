class Solution {
    public String[] findWords(String[] words) {
        List<String> list=new ArrayList<>();
        String st1="qwertyuiop";
        String st2="asdfghjkl";
        String st3="zxcvbnm";
        for(int i=0;i<words.length;i++){
            char val=Character.toLowerCase(words[i].charAt(0));
            String st=st1;
            if(st2.indexOf(val)!=-1){
                st=st2;
            }
            else if(st3.indexOf(val)!=-1){
                st=st3;
            }
            boolean flag=true;
            for(int j=1;j<words[i].length();j++){
                if(st.indexOf(Character.toLowerCase(words[i].charAt(j)))==-1){
                    flag=false;
                    break;
                }
            }
            if(flag){
                list.add(words[i]);
            }
        }

        String ans[]=new String[list.size()];
        int k=0;
        for(String v:list ){
            ans[k]=v;
            k++;
        }
        return ans;
    }
}