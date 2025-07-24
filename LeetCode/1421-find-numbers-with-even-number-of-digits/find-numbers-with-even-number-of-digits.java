class Solution {
    public int findNumbers(int[] nums) {
        int evenDigitCount = 0;
        for (int num : nums) {
            int digits = 0; 
            if (num == 0) { 
                digits = 1;
            } 
            else {
                int tempNum = num;
                while (tempNum > 0) {
                    tempNum /= 10; 
                    digits++;       
                }
            }
         
            if (digits % 2 == 0) {
                evenDigitCount++; 
            }
        }
        
        return evenDigitCount;
    }
}