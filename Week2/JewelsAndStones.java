class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<>();
        char[] jewels = J.toCharArray(), stones = S.toCharArray();
        int count = 0;
        
        // add all the chars in J to the map
        for (char c : jewels) {
            set.add(c);
        }
        
        //iterate over S to count
        for (char c : stones) {
            if (set.contains(c)) {
                count++;
            }
        }
        
        
        return count;
    }
}