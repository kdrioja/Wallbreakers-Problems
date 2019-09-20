class Solution {
    public void reverseString(char[] s) {
        int front = 0, back = s.length - 1;
        
        while (front <= back) {
            char temp = s[back];
            
            s[back] = s[front];
            s[front] = temp;
            
            front++;
            back--;
        }
    }
}