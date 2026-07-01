class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char x:s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(char a:t.toCharArray()){
            if(!map.containsKey(a)){
                return false;
            }
            map.put(a, map.get(a) - 1);
            if (map.get(a) == 0) {
                map.remove(a);
            }
        }
        return map.isEmpty();
    }
}
