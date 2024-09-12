class Solution {
    public int longestOnes(int[] nums, int k) {

        //use sliding window, -best approach
        int left=0;
        int right=0;
        int zero=0;
        int maxlen=0;
        int len=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            zero++;
            if(zero>k)
            {
                if(nums[left]==0)
                zero--;
            left++;
            }
            else if(zero<=k)
            {
            len=right-left+1;
            maxlen=Math.max(len,maxlen);
            }
            right++;
        }
        return maxlen;
    }}
        /*
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
*/