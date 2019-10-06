class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> usedWords = new HashSet<>();
        String[] words = str.split(" ");
        char[] patternArray = pattern.toCharArray();
        
        // if the number of chars in the pattern is not the same as the 
        // number of words in the string then it is not a match
        if (patternArray.length != words.length) {
            return false;
        }
        
        // check that they are a match
        for (int i = 0; i < patternArray.length; i++) {
            char c = patternArray[i];
            String word = words[i];
            
            // the char is already an entry in the map
            if (map.containsKey(c)) {
                // now just need to check that the value in the map matches the word
                if (!map.get(c).equals(word)) {
                    return false;
                }
            }
            // char is not in map
            else {
                // make sure that the word it is trying to map to has not been
                // used before
                if (usedWords.contains(word)) {
                    return false;
                }
                else {
                    // make the new entry mapping the char to the word
                    map.put(c, word);
                    // put the word in the usedWords set
                    usedWords.add(word);
                }
            }
        }
        
        return true;
    }
}