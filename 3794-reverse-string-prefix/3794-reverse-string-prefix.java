class Solution {
    public String reversePrefix(String s, int k) {
        char ch[]=s.toCharArray();
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