/*
* find max length substring of repeated characters
* i/p : abdcebbbccccab
* op : cccc
*/
package Companies;

public class MaxLengthSubstringOfRepeatedCharacters {
    public static void main(String[] args) {
        String input = "abdcebbbccccab";
        System.out.println("Max length substring: " + findMaxLengthSubstr(input));
    }

    private static String findMaxLengthSubstr(String input) {
        int n = input.length();
        if(n==0)
            return "";

        int maxLength = 1;
        int currentLength = 1;

        char[] charArray = input.toCharArray();
        char maxLengthChar = charArray[0];
        for(int i = 1; i<n; i++){
            if(charArray[i] == charArray[i-1])
                currentLength++;
            else{
                if(currentLength > maxLength){
                    maxLength = currentLength;
                    maxLengthChar = charArray[i-1];
                }
                currentLength = 1;
            }
        }

        // last substring check
        if(currentLength > maxLength){
            maxLength = currentLength;
            maxLengthChar = charArray[n-1];
        }

        System.out.println("max length character : " + maxLengthChar);
        System.out.println("Max length : "+ maxLength);
//        StringBuilder result = new StringBuilder();
//        for(int i=0; i< maxLength; i++){
//            result.append(maxLengthChar);
//        }
//        System.out.println(result);

//        return result.toString();
        return String.valueOf(maxLengthChar).repeat(maxLength);
    }
}
