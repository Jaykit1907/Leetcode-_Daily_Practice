class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missing=0;
        for(int i=0;i<arr.length;i++){
             missing=arr[i]-(i+1);
            if(missing>=k){
                if(i==0){
                    return k;
                }
                missing=arr[i-1]-i;
                int rs=k-missing;
                return arr[i-1]+rs;
            }
        }
        return arr[arr.length-1]+k-(arr[arr.length-1]-arr.length);
    }
}