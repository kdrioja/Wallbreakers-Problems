class Solution {
    public String longestCommonPrefix(String[] strs) {    
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        //First string will be the initial longest common prefix
        String currentLongest = strs[0];
        
        //Iterate through the rest of them 
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(currentLongest) != 0) {
                currentLongest = currentLongest.substring(0, currentLongest.length() - 1);
                
                if (currentLongest.isEmpty()) {
                    return "";
                }
            }
        }
        
        return currentLongest;
    }
}