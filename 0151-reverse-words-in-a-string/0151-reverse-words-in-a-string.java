class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder sbr=new StringBuilder();
        String word[]=s.split(" +");
        int start=0;
        int end=word.length-1;
        while(start<end){
            String temp=word[start];
            word[start]=word[end];
            word[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<word.length;i++){
            sbr.append(word[i]);
            if(i!=word.length-1){
                sbr.append(" ");
            }
        }

        return sbr.toString();
    }
}