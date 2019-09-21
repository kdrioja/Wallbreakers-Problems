/**
case 1:
    first letter is capital
    second is also capital and so therefore all the other ones should be

case 2:
    only first letter is capital
    
case 3:
    all letters are lowercase
**/

class Solution {
    public boolean detectCapitalUse(String word) {
        if (word == null || word.length() == 0) {
            return true;
        }
        
        boolean firstCapital = false, allLowerCase = false, allCapitals = false;
        
        if (Character.isUpperCase(word.charAt(0))) {
            firstCapital = true;
        }
        else {
            allLowerCase = true;
        }
        
        
        for (int i = 1; i < word.length(); i++) {
            char c = word.charAt(i);
            
            if (i == 1) {
                if (firstCapital && Character.isUpperCase(c)) {
                    allCapitals = true;
                }
                else if (allLowerCase && Character.isUpperCase(c)) {
                        return false;
                }
            }
            
            if (allCapitals && Character.isLowerCase(c)) {
                    return false;
            }
            else if (allLowerCase && Character.isUpperCase(c)) {
                    return false;
            }
            else if (firstCapital && Character.isUpperCase(c)) {
                    return false;
            }
        }
        
        return true;
    }
}