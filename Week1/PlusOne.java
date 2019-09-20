class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > -1; i--) {
            
            if (digits[i] < 9) {
                digits[i] += 1; //digits[i]++ ?
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }
        
        //if we haven't returned above, that means that we have an extra 1 we need to add
        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        
        return newDigits;
    }
}