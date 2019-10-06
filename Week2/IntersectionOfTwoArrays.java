/**
At best the solution is going to be O(m + n) where m and n are the lengths of 
the arrays since we have to traverse both of them to make sure we get the intersection
**/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        if (nums1 == null || nums2 == null) {
            int[] res = {};
            return res;
        }
        HashSet<Integer> resultSet = new HashSet<>();
        HashSet<Integer> nums1Set = new HashSet<>();
        
        // go through nums1 and insert all of the elements into the set
        for (int n : nums1) {
            nums1Set.add(n);
        }
        
        // now go through nums2 to check what elements it has in common with
        // nums1 and add it to thr result set
        for (int n : nums2) {
            if (nums1Set.contains(n)) {
                resultSet.add(n);
            }
        }
        
        // now convert the result set into an int[] and return it
        //int[] result = resultSet.stream().toArray(int[]::new);
        int[] result = new int[resultSet.size()];
        int i = 0;
        
        for (int n : resultSet) {
            result[i] = n;
            i++;
        }
        
        return result;
    }
}