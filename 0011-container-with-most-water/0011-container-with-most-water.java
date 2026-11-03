class Solution {
    public int maxArea(int[] height) {
        
        int max=0;
        int start=0;
        int end=height.length-1;
        while(start<end){
            int min=Math.min(height[start],height[end]);
            int width=end-start;
            int capacity=width*min;
            max=Math.max(max,capacity);
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }

        }
        return max;
    }
}