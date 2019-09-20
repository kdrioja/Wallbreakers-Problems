/**
racecar
0     6
 1   5
  2 4
   33
   
monaanom
0      7
 1    6
  2  5
   34
   43
**/

class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        else if (s == "") {
            return true;
        }
        else {
            /**
            int front, back;
            for (front = 0, back = s.length() - 1; front <= back; ) {
                if (s.charAt(front) != s.charAt(back)) {
                    return false;
                }
                front++;
                back--;
            }
            **/
            
            int front = 0, back = s.length() - 1;
            
            while (front <= back) {
                if (!Character.isLetterOrDigit(s.charAt(front))) {
                    front++;
                }
                
                if (!Character.isLetterOrDigit(s.charAt(back))) {
                    back--;
                }
                
                if (front <= s.length() -1 && back >= 0 &&
                    Character.isLetterOrDigit(s.charAt(front)) && Character.isLetterOrDigit(s.charAt(back))) {
                    if (Character.toLowerCase(s.charAt(front)) != Character.toLowerCase(s.charAt(back))) {
                        return false;
                    }
                    
                    front++;
                    back--;
                }
            }
            
            return true;
        }
    }
}