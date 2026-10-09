class Solution {
    public int[] finalPrices(int[] nums) {
        

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] <= nums[i]){
                    int cal=nums[i]-nums[j];
                    nums[i]=cal;
                    break;
                }
            }
        }
        return nums;
        
    }
}