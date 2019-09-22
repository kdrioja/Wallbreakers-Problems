class Solution {
    public int hammingDistance(int x, int y) {
        int difference = x ^ y, count = 0;
        
        while (difference > 0) {
            if ((difference & 1) == 1) {
                count++;
            }
            
            difference = difference >> 1;
        }
        
        return count;
    }
}

/**
Inefficient

String xBinary = Integer.toBinaryString(x), yBinary = Integer.toBinaryString(y);
        int xPointer = xBinary.length() - 1, yPointer = yBinary.length() - 1, sum = 0;
        
        System.out.println("x: " + xBinary);
        System.out.println("y: " + yBinary);
        
        //need to make them the same number of characters
        if (xBinary.length() > yBinary.length()) {
            //add padding to y
            
        }
        
        while (xPointer >= 0 && yPointer >= 0) {
            if (xBinary.charAt(xPointer) != yBinary.charAt(yPointer)) {
                sum++;
            }
            xPointer--;
            yPointer--;
        }
        
        return sum;
**/