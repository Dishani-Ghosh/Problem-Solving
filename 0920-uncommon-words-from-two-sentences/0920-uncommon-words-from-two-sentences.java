class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
    String fst[]=s1.split(" ");
    String scnd[]=s2.split(" ");
   HashMap<String, Integer> ww = new HashMap<>();

    for(var word:fst)
    {
        ww.put(word,ww.getOrDefault(word,0)+1);
    }
    for(var word1:scnd)
    {
        ww.put(word1,ww.getOrDefault(word1,0)+1);
    }
    ArrayList<String>arr=new ArrayList<>();
    for(Map.Entry<String,Integer> mm:ww.entrySet())
    {
        if(mm.getValue()==1)
        {
            arr.add(mm.getKey());
        }
    }
    return arr.toArray(new String[0]);
    }
}