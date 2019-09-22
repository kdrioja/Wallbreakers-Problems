class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }
        
        return result;
    }
    
    public boolean isSelfDividing(int num) {
        int div = num, digit = div % 10; //8
        
        while (div > 1) {
            if (digit == 0) {
                return false;
            }
            
            if (num % digit != 0) {
                return false;
            }
            
            div = div / 10;
            digit = div % 10;
        }
        
        return true;
    }
}