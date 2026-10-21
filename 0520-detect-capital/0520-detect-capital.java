class Solution {
    static boolean isCapital(char ch){
        if(ch>='A' && ch<='Z'){
            return true;
        }
        return false;
    }
    public boolean detectCapitalUse(String word) {
      
            int count=0;
            boolean first=false;
            for(int i=0;i<word.length();i++){
                
                    if(i==0 && isCapital(word.charAt(i))){
                        count++;
                        first=true;
                    }
                    else if(isCapital(word.charAt(i))){
                        count++;
                        first=false;
                    }

            }



            if(first){
                return true;
            }
            else if(count==word.length()){
                return true;
            }
            else if(count==0){
                return true;
            }
            else{
                return false;
            }
        

    }
}