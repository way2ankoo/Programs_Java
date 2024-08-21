package Companies;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "forgeeksk";
        System.out.println("Longest palindrome : " + longestPalindromicSubstring(s));
    }

    private static String longestPalindromicSubstring(String s) {
        String longest = "";

        for(int i = 0 ; i< s.length(); i++){
            String longest_odd = expandAroundCenter(i, i, s);
            if(longest_odd.length() > longest.length()){
                longest = longest_odd;
            }

            // even lengths palindromes
            String longest_even = expandAroundCenter(i, i+1, s);
            if(longest_even.length() > longest.length())
                longest = longest_even;
        }
        return  longest;
    }

    private static String expandAroundCenter(int left, int right, String s) {
        while(left >= 0 && right < s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }
}
