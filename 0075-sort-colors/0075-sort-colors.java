class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                //swap mid with low
                int t=nums[mid];
                nums[mid]=nums[low];
                nums[low]=t;
                low++;
                mid++;
            }
            else if(nums[mid]==1)
            mid++;
            else//nums[mid]==2
            {
                //swap mid with high
                int t=nums[mid];
                nums[mid]=nums[high];
                nums[high]=t;
                high--;
                
            }
        }
    }
}