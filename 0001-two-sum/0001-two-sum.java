class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer>hpp=new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
        int needed=target-nums[i];
        if(hpp.containsKey(needed))
        {
            return new int[]{hpp.get(needed),i};
        }
        hpp.put(nums[i],i);
       } 
       return new int[]{};
    }
}