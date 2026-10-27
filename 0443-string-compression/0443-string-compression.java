class Solution {
    public int compress(char[] chars) {
        StringBuilder sbr=new StringBuilder();
        int count=0;
       int start=0;
       char ch=chars[0];
        for(int i=0;i<chars.length;i++){
            if(ch==chars[i]){
                count++;
            }
            else{
                if(count>1){
                    sbr.append(ch);
                    sbr.append(count);
                    ch=chars[i];
                    count=1;
                }
                else{
                    sbr.append(ch);
                    count=1;
                    ch=chars[i];
                }
            }
        }
        if(count>1){
                    sbr.append(ch);
                    sbr.append(count);
                   
                }
                else{
                    sbr.append(ch);
                   
                }

          
           for(int i=0;i<sbr.length();i++){
                chars[i]=sbr.charAt(i);
           }     
        return sbr.length();
    }
}