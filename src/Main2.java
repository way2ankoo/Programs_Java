public class Main2 {
    public static void main(String[] args) {
        int[] pages = {5, 4, 3}; // example input
        int days = 4; // example input
        int result = findMinimumPagesPerDay(pages, days);
        System.out.println(result); // Expected output: 2
    }

    public static int findMinimumPagesPerDay(int[] pages, int days) {
        int maxPages = 0;
        int totalPages = 0;

        // Calculate the total pages and find the maximum pages in a single chapter
        for (int page : pages) {
            totalPages += page;
            maxPages = Math.max(maxPages, page);
        }

        // If days are less than number of chapters, it's impossible to finish reading
        if (days < pages.length) {
            return -1;
        }

        // Binary search to find the minimum pages per day
        int left = 1;
        int right = totalPages;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canFinish(pages, days, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    private static boolean canFinish(int[] pages, int days, int x) {
        int currentDays = 0;
        int currentPage = 0;

        for (int page : pages) {
            while (page > 0) {
                page -= Math.min(page, x);
                currentDays++;
                if (currentDays > days) {
                    return false;
                }
            }
        }

        return currentDays <= days;
    }
}
