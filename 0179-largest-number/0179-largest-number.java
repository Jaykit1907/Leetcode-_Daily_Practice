import java.util.Arrays;
class Solution {
    public String largestNumber(int[] nums) {
    StringBuilder sbr=new StringBuilder();
    String str[]=new String[nums.length];
    for(int i=0;i<nums.length;i++){
        str[i]=String.valueOf(nums[i]);
    }
    Arrays.sort(str,(a,b)->(a+b).compareTo(b+a));
    for(int i=str.length-1;i>=0;i--){
        sbr.append(str[i]);
    }
    if(sbr.charAt(0)=='0'){
        return "0";
    }
    else{
        return sbr.toString();
    }
}
}