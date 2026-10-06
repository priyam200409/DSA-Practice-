// https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/
class Solution{

    


    public int findGCD(int[] nums) {

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }

            if(nums[i]>max){
                max=nums[i];
            }
        }

        for (int i=min;i>1;i--){
            if(max%min==0){
                return min;
            }
            else if(max%i==0 && min%i==0){
                return i;
            }

        }
        
        return 1;
        
    }
}