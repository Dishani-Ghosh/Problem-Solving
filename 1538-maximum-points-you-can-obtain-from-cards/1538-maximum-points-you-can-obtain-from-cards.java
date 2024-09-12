class Solution {
    public int maxScore(int[] cardPoints, int k) {
      //optimized aprroach use sliding window and two pointer
      int sum=0;
      for(int i=0;i<k;i++)
      {
        sum+=cardPoints[i];
      }  
      int len=cardPoints.length;
      int maxsum=sum;
      for(int i=0;i<k;i++)
      {
        //remove from the front
        sum-=cardPoints[k-1-i];
        //add from the end
        sum+=cardPoints[len-1-i];
        maxsum=Math.max(sum,maxsum);

      }
      return maxsum;
    }
}