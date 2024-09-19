class Solution {
    public String largestNumber(int[] nums) {
        String arr[]=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=String.valueOf(nums[i]);//it convert integer value to string

        }
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        
        if(arr[0].equals("0"))
        return "0";
        StringBuilder sb=new StringBuilder();
        for(String i:arr)
        {
            sb.append(i);
        }
        return sb.toString();
    }
}