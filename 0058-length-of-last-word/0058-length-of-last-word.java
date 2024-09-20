class Solution {
    public int lengthOfLastWord(String s) {
     char arr[]=s.trim().toCharArray();

     int n=arr.length-1;
     int count=0;
     for(int i=n;i>=0;i--)
     {
        if(arr[i]!=' ')
        count++;
        else 
        break;
     }
     return count;
    }
}