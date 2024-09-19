class Solution {
    public String largestNumber(int[] nums) {
        String arr[]=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=String.valueOf(nums[i]);//it convert integer value to string

        }
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));//(30+3(b+a)=303 as a )compareTo(3+30=330(a+b) as b)
        //if a less than b then return -1
        //if b less than a then return 1|| and if equal= 0
        if(arr[0].equals("0"))
        return "0";//if first element is 0 then we take as 0 as a string dont skip it
        StringBuilder sb=new StringBuilder();
        for(String i:arr)
        {
            sb.append(i);
        }
        return sb.toString();
    }
}