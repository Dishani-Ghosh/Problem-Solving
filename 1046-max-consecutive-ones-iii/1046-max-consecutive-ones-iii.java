class Solution {
    public int longestOnes(int[] nums, int k) {
        //brute approach
        int maxlen=0;
        for(int i=0;i<nums.length;i++)
        {
            int zeroes=0;
            //first we find longest zeroes
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]==0)
                zeroes++;
                if(zeroes<=k)
                {
                   int len=j-i+1;
                maxlen=Math.max(maxlen,len);
                }
                else 
                break;
            }
        }
        return maxlen;
    }
}