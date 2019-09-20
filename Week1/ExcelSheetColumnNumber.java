/**
This is basically a base 26 number we need to conver to base 10
**/

class Solution {
    public int titleToNumber(String s) {
        int number = 0;
        int multiplier = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            number += ((Character.getNumericValue(s.charAt(i)) - 9) * Math.pow(26, multiplier));
            multiplier++;
        }
        
        return number;
    }
}