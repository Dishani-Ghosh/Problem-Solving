class Solution {
    public boolean check(int[] nums) {
       int cnt=0;
       int n=nums.length;
       for(int i=1;i<n;i++)
       {
        if(nums[i]<nums[i-1])// condition for not sorted
        cnt++;
       } 
       if(nums[n-1]>nums[0])//condition for not rotated
       cnt++;
       return cnt<=1;
    }
}