class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Step 1: Count frequency of each number
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Step 2: Create buckets
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (int i = 0; i <= nums.length; i++) {
            bucket[i] = new ArrayList<>();
        }
        // Step 3: Put numbers into buckets according to frequency
        List<Integer> keys = new ArrayList<>(map.keySet());
        for(int i =0; i<keys.size(); i++){
            int number = keys.get(i);
            int frequency = map.get(number);
            bucket[frequency].add(number);

        }
        // Step 4: Get top k frequent elements
        int[] ans = new int[k];
        int index = 0;

        for (int i = nums.length; i >= 1; i--) {

            for (int j = 0; j < bucket[i].size(); j++) {

                ans[index] = bucket[i].get(j);
                index++;

                if (index == k) {
                    return ans;
                }
            }
        }

        return ans;
    }
}
