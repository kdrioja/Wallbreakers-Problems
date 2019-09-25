class Solution {
    public int binaryGap(int N) {
        int distance = -1, maxDistance = 0;

        while (N > 0) {
            if (distance >= 0) {
                distance++;
            }
            
            if ((N & 1) == 1) {
                if (distance > maxDistance) {
                    maxDistance = distance;
                }
                
                distance = 0;
            }
            
            N = N >> 1;
        }

        return maxDistance;
    }
}
/**
//Holds the index of the last seen 1
        int lastIndex = -1, index = 0;
        //Holds the length of the longest gap
        int longestGap = 0;
        
        while (N > 0) {
            if ((N & 1) == 1) {
                if (lastIndex >= 0) {
                    if ((index - lastIndex) > longestGap) {
                        longestGap = index - lastIndex;
                    }
                    
                    lastIndex = index;
                }
            }
            System.out.println(N);
            N = N >> 1;
            System.out.println(N);
            index++;
        }
        
        return longestGap;
**/

/**
//32 bc an int's upper range is 2^32 
        for (int i = 0; i < 32; i++) {
            if (((N >> i) & 1) > 0) {
                if (lastIndex > 0) {
                    int currentGap = i - lastIndex;
                    
                    if (currentGap > longestGap) {
                        longestGap = currentGap;
                    }
                    
                    lastIndex = i;
                }
            }
        }
**/