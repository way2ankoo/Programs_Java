import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class length1 {

    public static int maxRectangleArea(List<Integer> sideLengths) {
        List<Integer> mutableSideLengths = new ArrayList<>(sideLengths);
        mutableSideLengths.sort(Collections.reverseOrder());
        System.out.println(mutableSideLengths);

        List<Integer> pairs = new ArrayList<>();

        for (int i = 0; i < mutableSideLengths.size() - 1; i++) {
            if (mutableSideLengths.get(i).equals(mutableSideLengths.get(i + 1)) ||
                    mutableSideLengths.get(i) - 1 == mutableSideLengths.get(i + 1)) {
                pairs.add(mutableSideLengths.get(i + 1));
                i++; // Skip the next element since we used it in a pair
            }
        }

        System.out.println(pairs);

        int maxSumArea = 0;

        // Calculate the maximum sum of areas
        for (int i = 0; i < pairs.size() - 1; i += 2) {
            maxSumArea += pairs.get(i) * pairs.get(i + 1);
        }

        return maxSumArea;
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> sideLengths = List.of(3,4,5,5,6,6,6,7, 3);
        int result = maxRectangleArea(sideLengths);
        System.out.println("Maximum sum of rectangle areas: " + result);
    }
}
