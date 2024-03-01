class Solution {
    public String maximumOddBinaryNumber(String s) {
         char[] c = s.toCharArray();
        Arrays.sort(c);
        reverse(c);
        for (int i = c.length - 1; i >= 0; i--) {
            if (c[i] == '1') {
                char temp = c[i];
                c[i] = c[c.length - 1];
                c[c.length - 1] = temp;
                break;
            }
        }
        return new String(c);
    }
    public static void reverse(char[] array)
    {
        int n = array.length;
 
        // Swapping the first half elements With last Half Elements
        for (int i = 0; i < n / 2; i++) {
            // Storing the first half elements temporarily
            char temp = array[i];
            // Assigning the first half to the last half
            array[i] = array[n - i - 1];
            // Assigning the last halfto the first half
            array[n - i - 1] = temp;
        }
    }
}
