// https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/
import java.util.*;
class Find_Greatest_Common_Divisor_of_Array_1979{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] nums=new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = findGCD(nums);

        System.out.println(result);
        


    }


    public static int findGCD(int[] nums) {

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