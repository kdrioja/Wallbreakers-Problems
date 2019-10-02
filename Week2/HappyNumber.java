class Solution {
    /**
    Happy Number
    
    - throw Exception due to infinite looping   
    
    */
    public boolean isHappy(int n) {
        //keep track of the numbers seen bc if we come to it again
        //we know we won't get to 1 i.e. cycle
        
        HashSet<Integer> numbersSeen = new HashSet<>();
        
        while (n != 1) {
            int current = n; //current number we are dealing with
            int sum = 0; //need to calculate the sum of the square of each digit
            
            while (current != 0) {
                sum += Math.pow(current % 10, 2); //current % 10 will return the last digit
                current /= 10; //current = current / 10 to truncate the last digit
            }
            
            //check if we have seen this sum before
            if (numbersSeen.contains(sum)) {
                return false; //to exit loop, therefore no exception needs to be thrown
            }
            
            numbersSeen.add(sum);
            n = sum;
        }
        return true;
    }
}