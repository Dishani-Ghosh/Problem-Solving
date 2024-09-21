class Solution {
    public List<Integer> lexicalOrder(int n) {
       String arr[]=new String[n];
       //insert String in arr not lexicographically
       for(int i=1;i<=n;i++)
       {
        arr[i-1]=String.valueOf(i);
       } 
      //now sort them lexicographically
      Arrays.sort(arr);
        List<Integer>ll=new ArrayList<>();
       for(int i=0;i<arr.length;i++)
       {
        ll.add(Integer.parseInt(arr[i]));
       }
       return ll;
    }
}