class Solution {
    public String largestNumber(int[] nums) {

        StringBuilder sbr=new StringBuilder();
        String st[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            st[i]=nums[i]+"";
        }
        Arrays.sort(st,(a,b)->{
            return (a+b).compareTo(b+a);
        });
        for(int i=st.length-1;i>=0;i--){
            sbr.append(st[i]);
        }
        if(st[nums.length-1].equals("0")){
            return "0";
        }
        else{
            return sbr.toString();
        }
    }
}