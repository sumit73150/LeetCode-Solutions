class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;


        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid]<arr[mid+1]){
                //asconding order ale part ma hu 
                //iska matlb main left part ma hu 
                //or mujhe pta hai answer right part ma hai 
                // to fataft right aprt ma move kro
                s = mid + 1;

            }
            else{
                //arr[mid]>=arr[mid+1]
                //iska matlb main right part ma hu 
                ans = mid;

                e = mid-1;


            }

            
        }
        return ans ;
    }
}