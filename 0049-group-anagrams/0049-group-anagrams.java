class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>>map=new HashMap<>();
       for(String word:strs)
       {
        char[] chars=word.toCharArray();
        Arrays.sort(chars);
        String shortword=new String(chars);
        if(!map.containsKey(shortword))
        {
            map.put(shortword,new ArrayList<>());
        }
        map.get(shortword).add(word);
       } 
       return new ArrayList<>(map.values());
    }
}