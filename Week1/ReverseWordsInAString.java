class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            //System.out.println(reverseString(words[i]));
            result.append(reverseString(words[i]));
            
            if (i < words.length - 1) {
                result.append(" ");
            }
            
        }
        
        return result.toString();
    }
    
    public String reverseString(String s) {
        char[] word = s.toCharArray();
        int front = 0, back = s.length() - 1;
        
        while (front <= back) {
            char temp = word[back];
            word[back] = word[front];
            word[front] = temp;
            
            front++;
            back--;
        }
        
        return new String(word);
        
    }
}