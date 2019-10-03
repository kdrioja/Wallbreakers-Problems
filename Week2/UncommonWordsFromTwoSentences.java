class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        HashSet<String> wordSet = new HashSet<>();
        HashSet<String> seenBefore = new HashSet<>();
        String[] Aarray = A.split(" "), Barray = B.split(" ");
        String[] result;
        int aPointer = 0, bPointer = 0;
        
        for (int i = 0; i < Aarray.length; i++) {
            if (!seenBefore.contains(Aarray[i])) {
                if (wordSet.contains(Aarray[i])) {
                    wordSet.remove(Aarray[i]);
                    seenBefore.add(Aarray[i]);
                }
                else {
                    wordSet.add(Aarray[i]);
                }
            }
        }
        
        for (int i = 0; i < Barray.length; i++) {
            if (!seenBefore.contains(Barray[i])) {
                if (wordSet.contains(Barray[i])) {
                    wordSet.remove(Barray[i]);
                    seenBefore.add(Barray[i]);
                }
                else {
                    wordSet.add(Barray[i]);
                }
            }
        }
        
        result = wordSet.stream().toArray(String[]::new);
        
        return result;
    }
}

/**
        while (aPointer < Aarray.length && bPointer < Barray.length) {
            if (!Aarray[aPointer].equals(Barray[bPointer])) {
                wordSet.add(Aarray[aPointer]);
                wordSet.add(Barray[bPointer]);
            }
            
            aPointer++;
            bPointer++;
        }
        
        
        result = new String[wordSet.size()];
        result = (String[]) wordSet.toArray();
        
        String[] values = findRoutes(starts[i], map).stream().toArray(String[]::new);
**/