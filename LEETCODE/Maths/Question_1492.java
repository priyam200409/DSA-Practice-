class Solution {
    public int kthFactor(int n, int k) {

        int count=0;
        int fac=1;
        for(int i=1;i<=n+1;i++){
            if(count==k){
                return fac;
            }

            if(n%i==0){
                count++;
                fac=i;
            }
        }
        return -1;
        
    }
}