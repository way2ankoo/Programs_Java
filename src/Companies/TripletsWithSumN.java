/*
 dialpad
 Given an array of integers, find all subsequences having length 3 and sum of 3 elements = sum and all three elements
 are distinct
*/

package Companies;

import java.sql.Array;
import java.util.*;

public class TripletsWithSumN {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, -1, -1, -3, 4};
        int sum = 8;
        findUniqueTriplets(arr, sum);
    }

    private static void findUniqueTriplets(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer e : arr){
//            map.compute(e, (k, v) -> (v == null) ? 1 : v+1);
            map.put(e, map.getOrDefault(e, 0) + 1);
//            if(! map.containsKey(e)){
//                map.put(e, 1);
//            }else{
//                map.put(e, map.get(e)+1);
//            }
        }

//        System.out.println(map.entrySet());
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + ": "+ entry.getValue());

        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                int firstElement = arr[i];
                int secondElement = arr[j];
                int thirdElement = sum - firstElement - secondElement;
                if(firstElement!=secondElement && secondElement!=thirdElement && firstElement!=thirdElement){
                    if(map.containsKey(thirdElement)){
//                        int[] newArr = {firstElement, secondElement, thirdElement};
//                        Arrays.sort(newArr);
//                        set.add(newArr);
                        List<Integer> newList = Arrays.asList(firstElement, secondElement, thirdElement);
                        Collections.sort(newList);
                        set.add(newList);
                    }
                }
            }
        }
        for(List<Integer> lis : set){
            System.out.println(lis);
        }

    }
}
