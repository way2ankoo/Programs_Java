/*
* Given a string, find all sequences that have 3 or more characters matching and print them
* i/p : “abchelloabctesthello”
* o/p : abc, hel, hell, hello*/
package Companies;

import java.util.*;

public class RepeatedSubsequences {
    public static void main(String[] args) {
        String str = "abchelloabctesthello";
        int minLength = 3;
        findRepeatedSubsequences(str, minLength);

    }

    private static void findRepeatedSubsequences(String str, int minLength){
        int n = str.length();
        Map<String, Integer> seen_map = new HashMap<>();
        Set<String> set = new TreeSet<String>();

        // choose window length, start from 3, minLength
        for(int len = minLength; len<=n; len++){
            for(int i = 0; i< n-len+1; i++){
                String subStr = str.substring(i, i+len);
                //System.out.println(subStr);
                if(seen_map.containsKey(subStr))
                    set.add(subStr);
//                    System.out.println(subStr);
                else{
                    seen_map.put(subStr, 1);
                }
            }
        }
//        Collections.sort(set);
        System.out.println(set);
    }
}
