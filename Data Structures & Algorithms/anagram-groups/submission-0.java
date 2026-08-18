class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map= new HashMap<>();
         for (String str : strs)
         {
            String key =getKey(str);
          map.computeIfAbsent(key, k-> new ArrayList<>()).add(str) ;
         }   
         return new ArrayList<>(map.values());
         
    }

    private String getKey(String s)
    {
        int key[]= new int[26];
        for ( char c: s.toCharArray())
        {
            key[c-'a']++;
        }
        return Arrays.toString(key);

    }
}

