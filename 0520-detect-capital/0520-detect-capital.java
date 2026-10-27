class Solution {
    static boolean isCapital(char ch){
        if(ch>='A' && ch<='Z'){
            return true;
        }
        return false;
    }
    public boolean detectCapitalUse(String word) {
        int count=0;
        boolean flag=false;
        for(int i=0;i<word.length();i++){
            if(isCapital(word.charAt(i))){
                count++;
                if(i==0){
                    flag=true;
                }
            }
            
        }
        if(count==0){
            return true;
        }
        else if(count==1 && flag){
            return true;
        }
        else if(count==word.length()){
            return true;
        }
        else{
            return false;
        }
    }
}