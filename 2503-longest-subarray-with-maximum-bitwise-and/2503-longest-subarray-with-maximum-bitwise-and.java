class Solution {
    public int longestSubarray(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>maxi)
            maxi=nums[i];
        }
        //we get max now find subarray
        int maxlen=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==maxi)
            {
                cnt++;
                maxlen=Math.max(cnt,maxlen);
            }
            else
            cnt=0;

        }
        return maxlen;
    }
}