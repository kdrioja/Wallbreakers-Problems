class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int front, back;
        
        for (int i = 0; i < A.length; i++) {
            front = 0;
            back = A[i].length - 1;
            
            while (front <= back) {
                int temp = A[i][back];
                A[i][back] = A[i][front];
                A[i][front] = temp;
                
                front++;
                back--;
            }
        }
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 0) {
                    A[i][j] = 1;
                }
                else {
                    A[i][j] = 0;
                }
            }
        }
        
        return A;
    }
}