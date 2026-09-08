class Solution {

    static int solve(int arr[], int target, int e , int s ){
        // base case 
        if(s > e){
            return -1;
        }
        //processing case 1
        int mid = s+(e - s)/2;

        if(arr[mid] == target){
            return mid;
        }
    // move left
         if(arr[mid] > target){
            e = mid - 1;
        }
        //move right
          if(arr[mid] < target){
            s = mid + 1;
        }
       return solve(arr, target, e, s);
         
    }
    public int search(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        int ans = solve(arr, target, e, s);
        return ans;
        // int n = nums.length;
        // int start = 0 ;
        // int end = n-1; 
        // // int mid = (start+end)/2;

        // int mid = start + (end-start)/2;

        // while(start <= end ){
        //     //comapre  target with midvalue 
        //     if(nums[mid] == target){
        //         //target found
        //         return mid;
        //     }

        //     else if(target > nums[mid]){
        //         // go to right side 
        //         start = mid+1;

        //     }

        //     else{

        //         //target < arr[mid]

        //         end = mid-1;
        //     }

        //     // update mid
        //     // mid = (start+end)/2;
            
        //     mid = start + (end-start)/2;
        // }

        // return -1;



        
    }
}