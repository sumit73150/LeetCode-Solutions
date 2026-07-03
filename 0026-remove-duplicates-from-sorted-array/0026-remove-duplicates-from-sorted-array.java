class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;

        while(j < n){
            if(nums[i] == nums[j]){
                j++;

            }
            else{
                //no match
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
        
    }
}