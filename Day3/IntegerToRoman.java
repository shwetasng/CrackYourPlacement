package Day3;

class Solution {
    public String intToRoman(int num) {
         // Define the integer values and their corresponding Roman numeral symbols
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder sb = new StringBuilder();
        
        // Iterate through the values and symbols arrays
        for (int i = 0; i < values.length && num > 0; i++) {
            // Append the symbol to the result as many times as the value fits into num
            while (num >= values[i]) {
                sb.append(symbols[i]);
                num -= values[i];
            }
        }
        
        return sb.toString();
    }
}
