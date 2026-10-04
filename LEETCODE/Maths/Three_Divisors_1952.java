//https://leetcode.com/problems/three-divisors/

class Three_Divisors_1952 {
    public static void main(String[] args) {
        isThree(4);
    }
    public static boolean isThree(int n) {
        int count=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }

        if(count==3){
            return true;
        }
        return false;        
    }
}