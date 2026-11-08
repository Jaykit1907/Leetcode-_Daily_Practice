class Solution {
    public String largestNumber(int[] nums) {
      StringBuilder sbr=new StringBuilder();
      String str[]=new String[nums.length];
      for(int i=0;i<nums.length;i++){
        str[i]=nums[i]+"";
      }
      Arrays.sort(str,(a,b)->{
        return (a+b).compareTo(b+a);
      });
      for(int i=str.length-1;i>=0;i--){
        sbr.append(str[i]);
      }
      if(str[str.length-1].equals("0")){
        return "0";
      }
      return sbr.toString();
    }
}