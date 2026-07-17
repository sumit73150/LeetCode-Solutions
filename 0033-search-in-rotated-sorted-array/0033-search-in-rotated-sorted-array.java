class Solution {
    static int findPivotIndex(int[]nums){
        int n = nums.length;
        int s = 0 ;
        int e = n-1;
        int ans = -1;

        if(nums[s]<nums[e]){
            //no effective rotation
            return -1;
        }

            //binary search logic 
            while(s<=e){
                int mid = s +(e-s)/2;

                if(nums[mid]<=nums[n-1]){
                    //iska mtlb hum L2 par hai 
                    //ans to L1 ma hai 
                    //movw to L1 or left 
                    e = mid - 1;

                }

                else{
                    //mid mera L1 par he hai 
                    // ans store 
                    ans = mid ;
                    // move to right 
                    s = mid +1;

                }
            }
            return ans ;
         }



 //binary search code 
 static int binarySearch(int nums[], int s, int e, int target){
    int n = nums.length;

    while(s<=e){
        int mid = s + (e-s)/2;

        if(nums[mid]==target){
            return mid;

        }
        else if(target > nums[mid]){
            s = mid + 1;

        }
        else{
            e = mid - 1;
        }
    }
    return -1;
 }




    public int search(int[] nums, int target) {
        int pivotIndex = findPivotIndex(nums);
        int n = nums.length;

        //if pivotindex = -1 then array is already sorted 
        if(pivotIndex == -1){
            int ans = binarySearch(nums, 0, n-1, target);
            return ans;
        }
        else{
            //aaray is not sorted array is rotated sorted
            int startArray1 = 0;
            int endArray1 = pivotIndex;
            if(target>= nums[startArray1] && target <=nums[endArray1]){
                int ans = binarySearch(nums, startArray1, endArray1, target);
                return ans ; 
            }

            //index for L2 
            int startArray2 = pivotIndex + 1;
            int endArray2 = n-1;
            if(target>= nums[startArray2] && target <=nums[endArray2]){
                int ans = binarySearch(nums, startArray2, endArray2, target);
                return ans ; 
            }
        }
        return -1; 
        
   
     }
}
