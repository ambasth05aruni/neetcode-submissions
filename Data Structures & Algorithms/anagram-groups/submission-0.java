class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] a = strs[i].toCharArray();
            Arrays.sort(a);
            String key = new String(a);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
             map.get(key).add(strs[i]);
        }
         return new ArrayList<>(map.values());
    }
}
