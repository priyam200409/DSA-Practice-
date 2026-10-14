class Solution {
    public boolean isPalindrome(int x) {
        int ori=x;
        int sum=0;

        while(x>0){
            int n1=x%10;
            sum=sum*10+n1;
            x=x/10;

        }
        if(sum==ori){
            return true;
        }
        else {
            return false;
        }
        
    }
}