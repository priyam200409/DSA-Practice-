//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/description/

class Solution {
    public int countOdds(int low, int high) {

        // Method 1

        // int count=0;
        // int dig=low;
        // if(low%2==0){
        //     dig=low+1;
            
        // }
        // for(int i=dig;i<=high;i=i+2){
        //     count++;
        // }
        // return count;


        //Method 2

        int count=(high+1)/2 -low/2;
        return count;
        
    }
}