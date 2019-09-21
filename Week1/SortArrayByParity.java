/**
    all non-negative
    all even elems front
    all odd elems back 
**/

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int front = 0, back = A.length - 1;
        
        while (front <= back) {
            if (A[front] % 2 == 1 && A[back] % 2 == 0) {
                int temp = A[back];
                A[back] = A[front];
                A[front] = temp;
                
                front++;
                back--;
            }
            
            if (A[front] % 2 == 0) { //&& front < A.length) {
                front++;
            }
            
            if (A[back] % 2 == 1) { //&& back > 0) {
                back--;
            }
            
        }
    
        return A;
    }
}