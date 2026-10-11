class Solution {
    public int sumOfSquares(int[] nums) {
        int n =nums.length;
        int pro=0;

        for(int i=0;i<n;i++){
            
            if(n % (i+1)==0){
                int s=nums[i]*nums[i];
                pro=pro+s;

            }

        }
        return pro;
        
    }
}