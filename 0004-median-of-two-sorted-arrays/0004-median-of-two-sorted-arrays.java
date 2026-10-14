class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length+nums2.length];
        int i=nums1.length-1;
        int j=nums2.length-1;
        int k=ans.length-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                ans[k]=nums1[i];
                i--;
                k--;
            }
            else{
                ans[k]=nums2[j];
                j--;
                k--;
            }
        }

        while(i>=0){
             ans[k]=nums1[i];
                i--;
                k--;
        }
        while(j>=0){
            ans[k]=nums2[j];
            j--;
            k--;
        }
        int n=ans.length;
        if(n%2==0){
            return (ans[n/2]+ans[(n/2)-1])/2.0;
        }
        else{
            return ans[n/2];
        }
    }
}