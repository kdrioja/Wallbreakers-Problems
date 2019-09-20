class Solution {
    public int singleNumber(int[] nums) {
        /**
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (map.)
            }
            else {
                
            }
        }
        **/
        
        int sum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            sum ^= nums[i];
        }
        
        return sum;
    }
}