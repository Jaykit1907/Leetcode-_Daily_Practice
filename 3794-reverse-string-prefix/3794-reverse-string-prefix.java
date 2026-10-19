class Solution {
    public String reversePrefix(String s, int k) {
        char ch[]=s.toCharArray();
      
        if(k>s.length()){
  k=k%s.length();
        }
        int start=0;
        int end=k-1;
        while(start<end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        return String.valueOf(ch);
    
    }
}