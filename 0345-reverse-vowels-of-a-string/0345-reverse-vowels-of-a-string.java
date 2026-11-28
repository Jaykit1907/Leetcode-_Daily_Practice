class Solution {
    static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
        ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        char str[]=s.toCharArray();
        int start=0;
        int end=str.length-1;
        while(start<end){
           if(isVowel(str[start]) && isVowel(str[end])){
                char temp=str[start];
                str[start]=str[end];
                str[end]=temp;
                start++;
                end--;
           }
           else if(!isVowel(str[start])){
            start++;
           }
           else{
            end--;
           }
        }
        return String.valueOf(str);
    }
}