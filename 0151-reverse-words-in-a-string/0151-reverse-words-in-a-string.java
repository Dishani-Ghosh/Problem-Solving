class Solution {
    public String reverseWords(String s) {
        String arr[]=s.trim().split("\\s+");
        //"\\s+" here \s is regular expression which indicate white space,tab
        // '\' it is escape character so \\s
        // + indicates one or more
        int start=0;
        int end=arr.length-1;// here arr is string of array so here we use length bcz it is array. instead length()
        while(start<=end)
        {
            String temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return String.join(" ",arr);
    }
}