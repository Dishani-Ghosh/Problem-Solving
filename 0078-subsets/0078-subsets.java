class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        createSub(nums,res,ans,0);
        return res;

    }

    //method create sub
    void createSub(int nums[],List<List<Integer>>res,List<Integer>ans,int index)
    {
        if(index>nums.length-1)
        {
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[index]);
        createSub(nums,res,ans,index+1);
        //backtracking
        ans.remove(ans.size()-1);
        createSub(nums,res,ans,index+1);
    }
}