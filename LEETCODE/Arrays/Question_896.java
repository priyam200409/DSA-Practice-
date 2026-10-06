//https://leetcode.com/problems/monotonic-array/

class Solution {
    public boolean isMonotonic(int[] nums) {
        int in=0;
        int de=0;
        

        for(int i=0;i<nums.length-1;i++){
            int j=i+1;

            if(i<=j && nums[i]<= nums[j]){
                in++;
            }
            if(i<=j && nums[i] >= nums[j]){
                de++;
            }

        }
        if(in==nums.length-1 || de==nums.length-1){
            return true;
        }
        else{
            return false;

        }
        
    }
}