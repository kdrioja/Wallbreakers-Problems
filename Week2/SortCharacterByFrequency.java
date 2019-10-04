class Solution {
    public String frequencySort(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Character> pQueue;
        StringBuilder result = new StringBuilder();
        char[] str = s.toCharArray();
        
        for (char c : str) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            /**
            if (map.containsKey(str[i])) {
                map.put(str[i], map.get(str[i]) + 1);
            }
            else {
                map.put(str[i], 1);
            }
            **/
        }
        
        pQueue = new PriorityQueue<>((x, y) -> map.get(y) - map.get(x));
        pQueue.addAll(map.keySet());
        
        while (!pQueue.isEmpty()) {
            char c = pQueue.poll();
            
            for (int i = 0; i < map.get(c); i++) {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}