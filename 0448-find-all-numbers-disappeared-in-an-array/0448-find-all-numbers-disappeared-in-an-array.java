class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        // marking 
        int n = nums.length;

        for(int index = 0; index<n; index++){
            int value = Math.abs(nums[index]);
            int position = value - 1;

            //mark kr do ye position
            if(nums[position]>0){
                nums[position] = -nums[position];
            }
        }
        //travel array and whenever you encounter a postive value print the number at the same time 
        for(int i=0; i<n; i++){
            if(nums[i]>0){
                int valueAtThisIndex = i+1;
                ans.add(valueAtThisIndex);
            }
        }

        return ans; 


        
    }
}