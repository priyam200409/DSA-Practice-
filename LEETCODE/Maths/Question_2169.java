//https://leetcode.com/problems/count-operations-to-obtain-zero/description/

class Solution {
    public int countOperations(int n1, int n2) {
        int count =0;

        while(n1>0 && n2>0){
            if(n1==n2){
                count++;
                return count;
            }
            if(n1>n2){
                n1=n1-n2;
                count++;
            }
            else if(n1<n2){
                n2=n2-n1;
                count++;
            }

        }
        return count;
        
    }
}