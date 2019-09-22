class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        char[] binArr = binary.toCharArray();
        
        for (int i = 0; i < binArr.length; i++) {
            if (binArr[i] == '0') {
                binArr[i] = '1';
            }
            else {
                binArr[i] = '0';
            }
        }

        return Integer.parseInt(new String(binArr), 2);
    }
}