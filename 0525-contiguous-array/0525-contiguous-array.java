class Solution {
    public int findMaxLength(int[] nums) {
        //use hashmap
        HashMap<Integer,Integer>hpp=new HashMap<>();
        hpp.put(0,-1);//we put -1 for 0
        //and we put 0 for 1
        int maxlength=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=(nums[i]==0?-1:1);
        if(hpp.containsKey(sum))
        {
        // If the same cumulative sum is found, that means the subarray from the previous
        // occurrence to the current index has an equal number of 0s and 1s
        maxlength=Math.max(maxlength,i-hpp.get(sum));
        }
        else
        hpp.put(sum,i);
        }
        return maxlength;
    }
}