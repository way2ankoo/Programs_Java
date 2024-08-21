public class Main3 {
    public static void main(String[] args) {
        int[] pages = {2, 4, 3}; // example input
        int days = 4; // example input
        int result = findMinimumPagesPerDay(pages, days);
        System.out.println(result); // Expected output: 2
    }

    public static int findMinimumPagesPerDay(int[] pages, int days) {
        int maxPages = 0;

        // Find the maximum pages in a single chapter
        for (int page : pages) {
            maxPages = Math.max(maxPages, page);
        }

        // Start with the maximum pages in a single chapter as the minimum x
        int x = maxPages;

        // Increase x until the student can finish all chapters within the given number of days
        while (!canFinish(pages, days, x)) {
            x++;
        }

        return x;
    }

    private static boolean canFinish(int[] pages, int days, int x) {
        int currentDays = 0;
        int remainingPages = 0;

        for (int page : pages) {
            remainingPages += page;
            while (remainingPages > 0) {
                remainingPages -= Math.min(remainingPages, x);
                currentDays++;
                if (currentDays > days) {
                    return false;
                }
            }
        }

        return currentDays <= days;
    }
}
