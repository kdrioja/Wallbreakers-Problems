class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        int duplicate = -1, missing = -1, range = -1;
        
        for (int n : nums) {
            if (n > range) {
                range = n;
            }
            
            if (map.containsKey(n)) {
                duplicate = n;
            }
            
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        /**
        if (range == duplicate) {
            range++;
        }
        **/
        
        for (int i = 1; i <= range + 1; i++) {
            if (!map.containsKey(i)) {
                missing = i;
                break;
            }
        }
        
        result[0] = duplicate;
        result[1] = missing;
        
        return result;
    }
}