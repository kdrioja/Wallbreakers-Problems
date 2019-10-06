class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] str = s.toCharArray();
        //int result = -1;
        
        for (char c : str) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < str.length; i++) {
            if (map.get(str[i]) == 1) {
                return i;
            }
        }
        
        return -1;
    }
}

/**
don't have to go over all of the characters bc we only need to find the 
first unique one
maybe we need a stack to keep track of the indices since as we traverse through 
the string it may be the case that the index we stored was not the unique character
it was actually a duplicate
oh no actually upon further inspection of this example: 
s = "loveleetcode",
return 2.
we do need to go through the entire string to make sure it is the first unique one


int index = -1;
leetcode

traverse through the string
so first we have l 
if l is in the set then that is not our index

return index;
**/