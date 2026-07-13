class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0 ;
        int end = n-1; 
        // int mid = (start+end)/2;

        int mid = start + (end-start)/2;

        while(start <= end ){
            //comapre  target with midvalue 
            if(nums[mid] == target){
                //target found
                return mid;
            }

            else if(target > nums[mid]){
                // go to right side 
                start = mid+1;

            }

            else{

                //target < arr[mid]

                end = mid-1;
            }

            // update mid
            // mid = (start+end)/2;
            
            mid = start + (end-start)/2;
        }

        return -1;



        
    }
}