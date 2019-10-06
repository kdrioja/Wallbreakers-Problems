//97  a
//...
//122 z

//'z' - 'a'
//122 - 97 = 25

//'a' - 'a'
//97 - 97 = 0

/**
You keep thinking of solutions that involve hash maps to count but 
remember CSC 311. Dr. Chaterjee said that if we know the range of items 
that are uniquely identified we can use an array of the size range in order
 to count the frequency of the items instead of using a hash map
 
 The array will be of size 26 and the index of the character will be calculated
 by subtracting 'a' from them bc they all have +97 to their index in the array alphabetically
**/
class Solution {
    public char findTheDifference(String s, String t) {
        //HashSet<Character> set = new HashSet<>();
        int[] chars = new int[26];
        char[] sArray = s.toCharArray(), tArray = t.toCharArray();
        
        for (char c : sArray) {
            int index = c - 'a'; //subtrating the +97 that is the int of the char
            chars[index]++;
        }
        
        //now we need to go through tArray
        //we are looking for a single character
        //and so that means that sArray will have a value of 0
        //and that's how we will know which one is the xtra char
        
        for (char c : tArray) {
            int index = c - 'a';
            if (chars[index] == 0) {
                return c;
            }
            chars[index]--;
        }
        
        /**
        for (char c : tArray) {
            if (!set.contains(c)) {
                return c;
            }
        }
        **/
        
        return 'a';
    }
}