/**
we take char s and char t
    if s is not in map and t is not in map as keys
        if s and t is not the same char
            map s to t & t to s
        else
            only map s to t
            
    else if s is in the map
        check that they accurately map to each other
        if not return else
    else if t is in the map
        check that they accuratelt map to each other
        if not returnn false
return true bc we have explored all chars

--modified approach mentioned above
the key to this problem was that there could only be 1 instance of a char in 
both the keys and values set
**/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> valuesSet = new HashSet<>();
        char[] sArray = s.toCharArray(), tArray = t.toCharArray();
        int sPointer = 0, tPointer = 0;
        
        while (sPointer < s.length() && tPointer < t.length()) {
            
            if (map.containsKey(sArray[sPointer])) {
                if (map.get(sArray[sPointer]) != tArray[tPointer]) {
                    return false;
                }
            }
            else {
                if (!valuesSet.contains(tArray[tPointer])) {
                    map.put(sArray[sPointer], tArray[tPointer]);
                    valuesSet.add(tArray[tPointer]);
                }
                else {
                    return false;
                }
            }
            
            sPointer++;
            tPointer++;
        }
        
        return true;
    }
        
}

/**
//if map doesn't contain s or t as keys, create the mapping
            if (!map.containsKey(sArray[sPointer]) && !map.containsKey(tArray[tPointer])) {
                if (sArray[sPointer] != tArray[tPointer]) {
                    map.put(sArray[sPointer], tArray[tPointer]);
                    map.put(tArray[tPointer], sArray[sPointer]);
                }
                else {
                    map.put(sArray[sPointer], tArray[tPointer]);
                }
            }
            
            //either s or t are in the map as keys, check for correct mapping from s to t
            else {
                if (map.containsKey(sArray[sPointer])) {
                    //check that current s char value maps correctly to t char pointer is pointing to
                    if (map.get(sArray[sPointer]) != tArray[tPointer]) {
                        return false;
                    }
                }
                else if (map.containsKey(tArray[tPointer])) {
                    //check that the current t char maps correctly to s char
                    if (map.get(tArray[tPointer]) != sArray[sPointer]) {
                        return false;
                    }
                }
            }
**/