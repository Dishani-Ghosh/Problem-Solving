class Solution {
    public void nextPermutation(int[] nums) {
       int n=nums.length;
       int idx=-1;
       for(int i=n-2;i>=0;i--)
       {
        if(nums[i]<nums[i+1])
        {
            idx=i;
            break;
        }
       } 
       if(idx==-1)
       {
        reverse(nums,0,n-1);
       }
       else{
        for(int i=n-1;i>idx;i--)
        {
            if(nums[i]>nums[idx])
            //swap
            {
                int t=nums[i];
                nums[i]=nums[idx];
                nums[idx]=t;
                break;
            }
        }
        reverse(nums,idx+1,n-1);
       }
    }
    void reverse(int nums[],int start,int end)
    {
        while(start<=end)
        {
            int t=nums[start];
            nums[start]=nums[end];
            nums[end]=t;
            start++;
            end--;
        }
    }
}