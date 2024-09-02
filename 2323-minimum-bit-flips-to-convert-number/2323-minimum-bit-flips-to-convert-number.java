class Solution {
    public int minBitFlips(int start, int goal) {
        int ans= (start^goal);//differnce ex: 1010^0111=1101
        int cnt=0;
        for(int i=0;i<32;i++)//bcz i is integer 32 bit
        {
            if((ans & (1<<i))!=0)//check ith bit is set or not
            cnt++;
        }
        return cnt;
            }
}