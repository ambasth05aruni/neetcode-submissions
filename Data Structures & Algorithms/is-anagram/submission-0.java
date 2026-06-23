class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i =0; i<s.length(); i++){
            map1.put(S[i], map1.getOrDefault(S[i], 0) + 1);
        }
         for(int j =0; j<t.length(); j++){
            map2.put(T[j], map2.getOrDefault(T[j],0)+1);
        }

         return map1.equals(map2);



    }
}
