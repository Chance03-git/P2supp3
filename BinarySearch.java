public class BinarySearch {
    /**
     * Static method to perform a binary search on a sorted list.
     *
     * @param arr   The sorted array of integers.
     * @param target The target value to search for.
     * @return The index of the target value if found, or -1 if not found.
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Target not found
        return -1;
    }

    // Test cases for the binarySearch method
public static void main(String[] args) {
    int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};

    // Test 1: Target is in the array
    int target1 = 7;
    int result1 = binarySearch(sortedArray, target1);
    System.out.println("Test 1: Searching for " + target1 + " -> Index: " + result1);

    // Test 2: Target is not in the array
    int target2 = 8;
    int result2 = binarySearch(sortedArray, target2);
    System.out.println("Test 2: Searching for " + target2 + " -> Index: " + result2);

    // Test 3: Target is the first element
    int target3 = 1;
    int result3 = binarySearch(sortedArray, target3);
    System.out.println("Test 3: Searching for " + target3 + " -> Index: " + result3);

    // Test 4: Target is the last element
    int target4 = 15;
    int result4 = binarySearch(sortedArray, target4);
    System.out.println("Test 4: Searching for " + target4 + " -> Index: " + result4);

    // Test 5: Array is empty
    int[] emptyArray = {};
    int target5 = 5;
    int result5 = binarySearch(emptyArray, target5);
    System.out.println("Test 5: Searching for " + target5 + " in an empty array -> Index: " + result5);
}
}