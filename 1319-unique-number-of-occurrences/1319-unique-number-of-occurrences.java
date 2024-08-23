class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       HashMap<Integer,Integer>hpp=new HashMap<>();
       HashSet<Integer>hs=new HashSet<>();
       for(int element:arr)
       {
        hpp.put(element,hpp.getOrDefault(element,0)+1);
       }
       for(int count:hpp.values())
       {
        if(!hs.add(count))
        return false;
       }
       return true;

    }
}