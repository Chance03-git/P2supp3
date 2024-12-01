public class BinarySearch {
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