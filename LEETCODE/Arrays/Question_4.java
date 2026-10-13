class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge=new int[nums1.length + nums2.length];
        int index=0;
        for(int i=0;i<nums1.length;i++){
            merge[index]=nums1[i];
            index++;
        }

        for(int i=0;i<nums2.length;i++){
            merge[index]=nums2[i];
            index++;
        }
        int s=0;
        int e=merge.length-1;
        int len=merge.length;
        Arrays.sort(merge);

        if(len%2!=0){
            int mid=s+(e-s)/2;
            return merge[mid];
            
        }
        else{
            return (merge[len/2 - 1] + merge[len/2]) / 2.0;

        }


        
    }
}