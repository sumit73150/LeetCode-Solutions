class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            //step1: sum create krte hai 
            sum = sum + nums[i];
            //step2: maxi update krte hai 
            maxi = Math.max(maxi, sum);
            //step2:sum check krte h for negative value 
            if(sum<0)
                sum = 0;
        }
        // return max value 
        return maxi;
    }
}