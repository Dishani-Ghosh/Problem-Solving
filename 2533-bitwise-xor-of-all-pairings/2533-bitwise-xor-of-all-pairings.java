class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
       /* memory limit exceed
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
           
            for(int j=0;j<nums2.length;j++)
            {
                int xor=nums1[i]^nums2[j];
                arr.add(xor);
            }
        }
        int fxor=0;
        for(int i:arr)
        {
            fxor=fxor^i;
        }
        return fxor;
        */
        int xornum1=0;
        int xornum2=0;
        for(int i:nums1)
        {
            xornum1^=i;
        }
        for(int j:nums2)
        {
            xornum2^=j;
        }
        int result=0;
        if(nums1.length%2!=0)
        {
            result^=xornum2;
        }
        if(nums2.length%2!=0)
        {
            result^=xornum1;
        }
        return result;
    }
}