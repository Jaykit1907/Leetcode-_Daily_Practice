class Solution {
    public int maxArea(int[] height) {

        int max=0;
        int start=0;
        int end=height.length-1;
        while(start<end){
            int width=end-start;
            int min=Math.min(height[end],height[start]);
            int curr_capacity=min*width;
            max=Math.max(max,curr_capacity);
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