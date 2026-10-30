class Solution {
    public String convertToTitle(int columnNumber) {    
        StringBuilder sbr=new StringBuilder();

        while(columnNumber>0){
            columnNumber--;
            int rem=columnNumber%26;
            sbr.insert(0,(char)('A'+rem));
            columnNumber=columnNumber/26;
        }
        return sbr.toString();
    }
}