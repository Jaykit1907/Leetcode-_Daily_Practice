class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder sbr=new StringBuilder();
        String ch[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            ch[i]=nums[i]+"";
        }
        Arrays.sort((ch),(a,b)->{
            return (b+a).compareTo(a+b);
        }
        );

        if(ch[0].equals("0")){
            return "0";
        }
       int i=0;
       while(i<ch.length){
            if(ch[i].equals("0") && sbr.length()==0){
                continue;
            }
            sbr.append(ch[i]);
            i++;
       }
        return sbr.toString();
    }
}