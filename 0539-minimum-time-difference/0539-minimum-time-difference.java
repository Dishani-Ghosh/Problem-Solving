class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer>arr=new ArrayList<>();
        for(String time:timePoints)
        {
            String parts[]=time.split(":");
            int hours=Integer.parseInt(parts[0]);
            int minute=Integer.parseInt(parts[1]);
            int total=hours*60+minute;
            arr.add(total);
        }
        Collections.sort(arr);
       //diff
       int minDiff=Integer.MAX_VALUE;
       for(int i=1;i<arr.size();i++)
       {
        minDiff=Math.min(minDiff,(arr.get(i)-arr.get(i-1)));
       }
       //handle the circular case 1st and last time
       int firstLastDiff = arr.get(0) + (1440 - arr.get(arr.size() - 1));
        minDiff = Math.min(minDiff, firstLastDiff);
return minDiff;
    }
}