class Solution {
    public int trailingZeroes(int n) {
// We repeatedly divide n by 5 to count how many multiples of 5 there are.
// Then, we add that count to our result since each multiple of 5 contributes at least one 5 to the factorization.
// Multiples of 25 (like 25, 50, 75, etc.) contribute an extra 5 because they contain two 5s (as 25 = 5 * 5), so we divide by 5 again to account for these.
// We repeat this process until n becomes less than 5.

      int cnt=0;
      while(n>=5)
      {
        n/=5;
        cnt+=n;
      }  
      return cnt;
    }
}        
        /* 
        //for large number it is not working

        int fact=1;
        for(int i=n;i>1;i--)
        {
            fact=fact*i;
        }
        String ss=Integer.toString(fact);
        char c[]=ss.toCharArray();
        int cnt=0;
        for(int i=c.length-1;i>=0;i--)
        {
            if(c[i]=='0')
            {
                cnt++;
            }
            else
           { break;
           }
        }
        return cnt;
        */