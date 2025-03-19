class Solution {
    public void sortColors(int[] nums) {
       int len=nums.length;
       int low=0;
       int mid=0;
       int high=len-1;
       while(mid<=high)
       {
        if(nums[mid]==0)
        {
            int t=nums[mid];
            nums[mid]=nums[low];
            nums[low]=t;
            low++;
            mid++;
        }
        else if(nums[mid]==1)
        {
            mid++;
        }
        else
        {
            int t=nums[high];
            nums[high]=nums[mid];
            nums[mid]=t;
            high--;
        }
       } 
    }
}