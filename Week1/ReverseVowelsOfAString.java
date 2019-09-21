class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int front = 0, back = s.length() - 1;
        
        while (front <= back) {
            if (isVowel(str[front]) && isVowel(str[back])) {
                // both are vowels, switch
                char temp = str[back];
                str[back] = str[front];
                str[front] = temp;
                
                front++;
                back--;
            }
            else if (!isVowel(str[front])) {
                front++;
            }
            else if (!isVowel(str[back])) {
                back--;
            }
        }
        
        return new String(str);
    }
    
    
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}