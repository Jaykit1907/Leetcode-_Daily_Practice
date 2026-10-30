class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
            int carry=0;
            List<Integer> list=new ArrayList<>();
        for(int i=num.length-1;i>=0;i--){
            int last=k%10;
            k=k/10;
            int sum=(num[i]+last+carry);
            carry=sum/10;
            list.add(sum%10);
        }
       
        while(k>0){
            int sum=k%10+carry;
            carry=sum/10;
            list.add(sum%10);
            k=k/10;
                    }
    if(carry!=0){
        list.add(carry);    }

        Collections.reverse(list);
        return list;
    }
}