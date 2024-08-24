class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
     int arr[]=new int[n+1];
     arr[0]=1;
     for(int i=n-1;i>=0;i--)
     {
        if(digits[i]<9){
            digits[i]++;//just update last digit then return it does not check anything if last ele is not 9
            return digits;}
        digits[i]=0;

    }
    return arr;
    }
}