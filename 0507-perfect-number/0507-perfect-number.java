class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        int n=num/2;
     for(int i=1;i<=n;i++)
     {
        if(num%i==0)
        sum=sum+i;
     }   
     if(sum==num)
     return true;
    return false;
    }
}